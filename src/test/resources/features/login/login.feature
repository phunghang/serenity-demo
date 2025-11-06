Feature: Login

  Scenario: Login thành công
    Given Tồn tại tài khoản với username "phunghang" và mật khẩu "123456"
    When Truy cập trang "login"
    And Đăng nhập vào hệ thống bằng tài khoản "phunghang", mật khẩu "Phungthihang@95"
    Then Đăng nhập thành công, hiển thị trang Dashboard

  Scenario Outline: Login thất bại
    Given Tồn tại tài khoản với username "phunghang" và mật khẩu "123456"
    When Truy cập trang "login"
    And Đăng nhập vào hệ thống bằng tài khoản "<username>", mật khẩu "<pass>"
    Then Đăng nhập không thành công, hiển thị thông báo lỗi "Invalid credentials"
    Examples:
      | username  | pass |
      | abc       | 123  |
      | phunghang | 123  |