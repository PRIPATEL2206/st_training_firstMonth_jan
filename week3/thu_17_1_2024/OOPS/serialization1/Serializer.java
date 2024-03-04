package serialization1;

import java.lang.reflect.Field;

class Serializer {

    public static String serialize(Object obj) {
        Class<?> clazz = obj.getClass();
        StringBuilder serializedData = new StringBuilder();

        // Iterate through fields using reflection
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true); // Allow access to private fields

            try {
                Object value = field.get(obj);
                String fieldName = field.getName();
                String fieldValue = (value != null) ? value.toString() : "null";

                // Append field name and value to the serialized data
                serializedData.append(fieldName).append(":").append(fieldValue).append(",");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return "{" + serializedData.toString() + "}";
    }
}
