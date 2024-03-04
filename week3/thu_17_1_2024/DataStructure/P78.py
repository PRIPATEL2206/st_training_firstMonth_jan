class Point:
    def __init__(self, coordinates):
        self.coordinates = coordinates
        self.left = None
        self.right = None

def construct_kd_tree(points, depth=0):
    if not points:
        return None

    k = len(points[0].coordinates)
    axis = depth % k

    
    points.sort(key=lambda x: x.coordinates[axis])
    median_index = len(points) // 2

    
    node = points[median_index]
    node.left = construct_kd_tree(points[:median_index], depth + 1)
    node.right = construct_kd_tree(points[median_index + 1:], depth + 1)

    return node

def search_kd_tree(root, target, depth=0):
    if root is None:
        return None

    k = len(target)
    axis = depth % k

    if target[axis] < root.coordinates[axis]:
        return search_kd_tree(root.left, target, depth + 1)
    elif target[axis] > root.coordinates[axis]:
        return search_kd_tree(root.right, target, depth + 1)
    else:
        
        if root.coordinates == target:
            return root
        left_result = search_kd_tree(root.left, target, depth + 1)
        right_result = search_kd_tree(root.right, target, depth + 1)

        
        if left_result and right_result:
            if distance(target, left_result.coordinates) < distance(target, right_result.coordinates):
                return left_result
            else:
                return right_result
        elif left_result:
            return left_result
        else:
            return right_result

def distance(point1, point2):
    return sum((a - b) ** 2 for a, b in zip(point1, point2)) ** 0.5


points = [Point([2,3]), Point([5,7]), Point([8,4]), Point([9,6]), Point([10,1])]
kd_tree = construct_kd_tree(points)


target_point = [3, 9]
result = search_kd_tree(kd_tree, target_point)

if result:
    print(f"Found point at coordinates {result.coordinates}")
else:
    print("Point not found.")
