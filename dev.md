POST  /user/login  param: username password   登录

GET /user/position/{userId}    获取定位信息

GET /user/allPosition/{userId}   获取所有定位信息

POST /user/position/{userId}   param: x，y，z   上传定位信息

GET 	/notification    获取公告

GET  /user/chat/{userId}   获取最近收到的消息

POST  /user/chat/{userId}     param:  username message  给指定用户发送消息

POST  /user/register  param: username password  用户注册

POST  /admin/notification_upload param: content 上传公告
