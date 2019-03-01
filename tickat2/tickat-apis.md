# APIs

## Login

### 1. 账户登录 

| url    | /api/login/pwd | POST                     |
| :----- | :------------- | ------------------------ |
| 参数   | username       | 用户名                   |
|        | password       | 密码                     |
| 返回值 | type           | 结果，0：成功，1：失败   |
|        | data           | { id, nickname, avatar } |
|        | message        | 失败时返回错误消息       |

**eg**:

{ type: 0, data: { id: '000001', nickname: 'admin', avatar: 'images/avatars/default.jpg'} }

{ type: 1, message: '用户名或密码错误' }

### 2. 短信登录（暂时不做）

| url    | /api/login/sms | POST                                      |
| ------ | -------------- | ----------------------------------------- |
| 参数   | mobile         | 手机号                                    |
|        | code           | 验证码                                    |
| 返回值 | type           | 0：成功；1：失败                          |
|        | message        | 成功时返回跳转页面url，失败时返回错误消息 |

### 3. 发送短信登录验证码（暂时不做）

| url    | /api/login/sendCode | POST                                      |
| ------ | ------------------- | ----------------------------------------- |
| 参数   | mobile              | 手机号                                    |
| 返回值 | type                | 0：成功；1：稍后重试；Other：24小时后再试 |
|        | message             | 失败时返回错误消息                        |

### 4. 获取OAuth信息

| url    | /api/login/oauth | GET                    |
| ------ | ---------------- | ---------------------- |
| 参数   | 无               |                        |
| 返回值 | data             | { qq, wechat, github } |

   **eg**:

 { 'qq': 'https://……', 'wechat': 'https://……', 'github': 'https://……' }

可以先全部返回 ‘#’ 即可

## Signup

### 1. 账户注册

| url    | /api/signup                    | POST                   |
| :----- | :----------------------------- | ---------------------- |
| 参数   | { username, password, mobile } | 用户信息               |
| 返回值 | type                           | 结果，0：成功；1：失败 |
|        | message                        | 失败时返回错误消息     |

   **eg**:

   { type: 0, message: 'OK' }

   { type: 1, message: 'UnexpectedError' }

### 2.  用户名验证

| url    | /api/signup/validate | POST                                                         |
| ------ | -------------------- | ------------------------------------------------------------ |
| 参数   | username             | 用户名                                                       |
| 返回值 | type                 | 0：成功；<br />1：用户名已存在；<br />2：用户名违法；<br />Other：自定义消息 |
|        | message              | 错误信息                                                     |
**eg**: 

 { type: 0, message: 'OK' }

 { type: 1, message: 'UsernameExisting' }

 { type: 2, message: 'UsernameIllegal' }

 { type: 3, message: 'UnexpectedError' }

## TodoList

### 1. 获取TodoList列表 

| url    | /api/todolist | GET                                                          |
| ------ | ------------- | ------------------------------------------------------------ |
| 参数   | 无            |                                                              |
| 返回值 | data          | [{ id, title, createTime, content, allowEdit, isDone }] (具体还没定下来) |

**eg:**

[

​	{ id: '00001', title: '1', createTime: '\/Date(1391141532000)\/', content: 'this is first', allowEdit: true, isDone: false },

​	{ id: '00002', title: '2', createTime: '\/Date(1391141532000)\/', content: 'this is second', allowEdit: true, isDone: false },

]

ps: 时间在json格式不一定，不用拼凑字符串，直接返回就行

### 2. 新建Todo

| url    | /api/todolist | POST             |
| ------ | ------------- | ---------------- |
| 参数   | todo item     | 不包含id         |
| 返回值 | type          | 0：成功；1：失败 |
|        | message       | 错误信息         |
|        | data          | 包含id           |

**eg:**

post: { title: 'new', createTime: '\/Date(1391141532000)\/', content: '' },

request: { id: 'newId',  title: '1', createTime: '\/Date(1391141532000)\/', content: '', allowEdit: true, isDone: false },

### 3. 修改Todo

| url  | /api/todolist
 | PUT  |
| ---- | ------------------ | ---- |
| 参数 | todo Item          |      |

**eg:**

 { id: '00001', title: '123', createTime: '\/Date(1391141532000)\/', content: '', isDone: true },

### 4. 删除Todo

| url  | /api/todolist/{id} | DELETE |
| ---- | ------------------ | ------ |
| 参数 | 无                 |        |
