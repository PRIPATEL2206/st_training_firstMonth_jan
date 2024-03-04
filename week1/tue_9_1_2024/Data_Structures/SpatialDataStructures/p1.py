class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

class Quadtree:
    def __init__(self, boundary, capacity):
        self.boundary = boundary  # (x, y, width, height)
        self.capacity = capacity
        self.points = []
        self.subdivided = False
        self.northwest = None
        self.northeast = None
        self.southwest = None
        self.southeast = None

    def insert(self, point):
        if not self.boundary_contains_point(point):
            return False

        if len(self.points) < self.capacity:
            self.points.append(point)
            return True
        else:
            if not self.subdivided:
                self.subdivide()

            if self.northwest.insert(point):
                return True
            elif self.northeast.insert(point):
                return True
            elif self.southwest.insert(point):
                return True
            elif self.southeast.insert(point):
                return True

    def subdivide(self):
        x, y, width, height = self.boundary
        half_width = width / 2
        half_height = height / 2
        nw = (x, y, half_width, half_height)
        ne = (x + half_width, y, half_width, half_height)
        sw = (x, y + half_height, half_width, half_height)
        se = (x + half_width, y + half_height, half_width, half_height)

        self.northwest = Quadtree(nw, self.capacity)
        self.northeast = Quadtree(ne, self.capacity)
        self.southwest = Quadtree(sw, self.capacity)
        self.southeast = Quadtree(se, self.capacity)
        self.subdivided = True

    def query_range(self, range_boundary, found_points):
        x, y, width, height = range_boundary

        if not self.intersects_range(range_boundary):
            return

        for point in self.points:
            if x <= point.x < x + width and y <= point.y < y + height:
                found_points.append(point)

        if self.subdivided:
            self.northwest.query_range(range_boundary, found_points)
            self.northeast.query_range(range_boundary, found_points)
            self.southwest.query_range(range_boundary, found_points)
            self.southeast.query_range(range_boundary, found_points)

    def boundary_contains_point(self, point):
        x, y, width, height = self.boundary
        return x <= point.x < x + width and y <= point.y < y + height

    def intersects_range(self, range_boundary):
        x, y, width, height = range_boundary
        return not (x + width < self.boundary[0] or
                    y + height < self.boundary[1] or
                    x > self.boundary[0] + self.boundary[2] or
                    y > self.boundary[1] + self.boundary[3])

boundary = (0, 0, 100, 100)
quadtree = Quadtree(boundary, 4)

points_to_insert = [Point(10, 10), Point(80, 80), Point(25, 75), Point(50, 50)]

for point in points_to_insert:
    quadtree.insert(point)

query_range_boundary = (0, 0, 30, 30)
found_points = []
quadtree.query_range(query_range_boundary, found_points)

print("Points in the range:", [(p.x, p.y) for p in found_points])