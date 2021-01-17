package cn.luotuoyulang.entitys;

import org.springframework.context.annotation.Lazy;
import org.springframework.lang.Nullable;

@Lazy()
public class PersonEntity {
    private String name;
    private  Integer age;

    public PersonEntity() {
        System.out.println("name = " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private static final String FOLDER_SEPARATOR = "/";

    public static void main(String[] args) {
        String path = "http://luotuoyulang.cn/123/abc.png";
        System.out.println(getFilename(path));
    }

    @Nullable
    public static String getFilename(@Nullable String path) {
        if (path == null) {
            return null;
        }

        int separatorIndex = path.lastIndexOf(FOLDER_SEPARATOR);
        String substring = path.substring(separatorIndex + 1);
        System.err.println(substring);
        return (separatorIndex != -1 ? path.substring(separatorIndex + 1) : path);
    }
}