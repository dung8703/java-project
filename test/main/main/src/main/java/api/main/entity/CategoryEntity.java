package api.main.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
// entity dùng để tạo bảng trong java không cần dùng đến câu lệnh SQL mà tự chuyển đổi qua
@Table(name = "category")
public class CategoryEntity extends BaseEntity{

}
