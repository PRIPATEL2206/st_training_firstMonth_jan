def is_overlapping(rect1, rect2):

    x1, y1, w1, h1 = rect1
    x2, y2, w2, h2 = rect2

    x_overlap = (x1 < x2 + w2) and (x1 + w1 > x2)

    y_overlap = (y1 < y2 + h2) and (y1 + h1 > y2)

    return x_overlap and y_overlap

rectangle1 = (0, 0, 4, 4)
rectangle2 = (2, 2, 4, 4)

if is_overlapping(rectangle1, rectangle2):
    print("Rectangles overlap")
else:
    print("Rectangles do not overlap")