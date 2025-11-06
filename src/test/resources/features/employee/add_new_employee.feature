Feature: Thêm mới nhân viên

  Scenario: Thêm mới nhân viên thành công
    Given Truy cập trang "login"
    And Đăng nhập vào hệ thống bằng tài khoản "hang_automationHR", mật khẩu "Hang95@***"
    When Truy cập trang "danh sách nhân viên"
    And Thực hiện thêm nhân viên với thông tin
      | first name | midle name | last name | avatar     |
      | Phùng      | Thị        | Hằng      | avatar.jpg |
    Then Thêm mới thành công
    And Chi tiết nhân viên vừa thêm có thông tin
      | first name | midle name | last name |
      | Phùng      | Thị        | Hằng      |
