
public class ShapeMaker {
    /**
     * Returns a string that looks like a square with sides of size "size". If size = 5, the square looks like this:
     * <p>
     * * * * * *
     * * * * * *
     * * * * * *
     * * * * * *
     * * * * * *
     *
     * @param size length of side
     * @return a string that looks like the shape above when printed
     */
    public static String PrintSquare(int size) {
        String s = "";
        for (int i = 0; i < size; i++) {
            for (int t = 0; t < size; t++) {
                s += "* ";
            }
            s += "\n";
        }
        return s;
    }

    /**
     * Returns a string that looks like a rectangle with sides of size "length" and "width. If length = 5, width = 4 the rectangle looks like this:
     * <p>
     * * * * * *
     * * * * * *
     * * * * * *
     * * * * * *
     *
     * @param length the width of the rectangle
     * @param height the height of the rectangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRectangle(int length, int height) {
        String s = "";
        for (int i = 1; i <= height; i++) {
            for (int t = 1; t <= length; t++) {
                s += "* ";
            }
            s += "\n";
        }
        return s;
        // write your code here
    }

    /**
     * Returns a string that looks like a right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * <p>
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRightTriangle(int height) {
        String t = "";
        int m = height;
        for (int i = 1; i <= height; i++) {
            for (int s = 0; s < i; s++) {
                t += "* ";
            }
            t += "\n";
        }
        return t;
        // write your code here
    }

    /**
     * Returns a string that looks like an inverted right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * <p>
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintInvertedRightTriangle(int height) {
        String str = "";
        for (int i = height; i > 0; i--) {
            for (int s = 0; s < i; s++) {
                str += "* ";
            }
            str += "\n";
        }
        return str;
    }

    /**
     * Returns a string that looks like a backwards right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * <p>
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */

    public static String PrintBackwardsRightTriangle(int height) {
        String str = "";
        for (int i = height; i > 0; i--) {
            for (int s = 1; s <= height; s++) {
                if (s < i)
                    str += "  ";
                else
                    str += "* ";
            }
            str += "\n";
        }
        // write your code here
        return str;
    }

    /**
     * Returns a string that looks like an equilateral triangle with sides of size "size". If size = 5, the triangle looks like this:
     * <p>
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintEquilateralTriangle(int height) {
        String str = "";
        for (int i = 1; i <= height; i++) {
            for (int j = i; j <height; j++) {
                str += " ";
            }
            for (int t = 1; t <= i; t++) {
                str += "* ";
            }
            str += "\n";
        }
        return str;
    }
}

