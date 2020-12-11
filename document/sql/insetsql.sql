-- ----------------------------
-- Records of ums_admin
-- ----------------------------
INSERT INTO `ums_admin` VALUES ('1', 'admin', '$2a$10$GOR3oE0FiGwvHV4mVPwRQO3bIdDaXfS2Y6/LWgrEQwc5DePyQBL4i', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/timg.jpg', 'admin@163.com', '系统管理员', '系统管理员', '2018-10-08 13:32:47', '2019-04-20 12:45:16', '1');

-- ----------------------------
-- Records of ums_role
-- ----------------------------
INSERT INTO `ums_role` VALUES ('1', '超级管理员', '拥有所有查看和操作功能', '0', '2020-02-02 15:11:05', '1', '0');

-- ----------------------------
-- Records of ums_admin_role_relation
-- ----------------------------
INSERT INTO `ums_admin_role_relation` VALUES ('1', '1', '1');

-- ----------------------------
-- Records of ums_menu
-- ----------------------------
INSERT INTO `ums_menu` VALUES ('21', NULL, '2020-02-07 16:29:13', '权限', '0', '0', 'ums', 'ums', '0');
INSERT INTO `ums_menu` VALUES ('22', '21', '2020-02-07 16:29:51', '用户列表', '1', '0', 'admin', 'ums-admin', '0');
INSERT INTO `ums_menu` VALUES ('23', '21', '2020-02-07 16:30:13', '角色列表', '1', '0', 'role', 'ums-role', '0');
INSERT INTO `ums_menu` VALUES ('24', '21', '2020-02-07 16:30:53', '菜单列表', '1', '0', 'menu', 'ums-menu', '0');
INSERT INTO `ums_menu` VALUES ('25', '21', '2020-02-07 16:31:13', '资源列表', '1', '0', 'resource', 'ums-resource', '0');

-- ----------------------------
-- Records of ums_resource_category
-- ----------------------------
INSERT INTO `ums_resource_category` VALUES ('4', '2020-02-05 10:23:04', '权限模块', '0');

-- ----------------------------
-- Records of ums_resource
-- ----------------------------
INSERT INTO `ums_resource` VALUES ('25', '4','2020-02-07 16:47:34', '后台用户管理', '/admin/**', '');
INSERT INTO `ums_resource` VALUES ('26', '4', '2020-02-07 16:48:24', '后台用户角色管理', '/role/**', '');
INSERT INTO `ums_resource` VALUES ('27', '4', '2020-02-07 16:48:48', '后台菜单管理', '/menu/**', '');
INSERT INTO `ums_resource` VALUES ('28', '4', '2020-02-07 16:49:18', '后台资源分类管理', '/resourceCategory/**', '');
INSERT INTO `ums_resource` VALUES ('29', '4', '2020-02-07 16:49:45', '后台资源管理', '/resource/**', '');

-- ----------------------------
-- Records of ums_role_resource_relation
-- ----------------------------
INSERT INTO `ums_role_resource_relation` VALUES ('170', '1', '25');
INSERT INTO `ums_role_resource_relation` VALUES ('171', '1', '26');
INSERT INTO `ums_role_resource_relation` VALUES ('173', '1', '27');
INSERT INTO `ums_role_resource_relation` VALUES ('174', '1', '28');
INSERT INTO `ums_role_resource_relation` VALUES ('175', '1', '29');

-- ----------------------------
-- Records of ums_role_menu_relation
-- ----------------------------
INSERT INTO `ums_role_menu_relation` VALUES ('33', '1', '21');
INSERT INTO `ums_role_menu_relation` VALUES ('34', '1', '22');
INSERT INTO `ums_role_menu_relation` VALUES ('35', '1', '23');
INSERT INTO `ums_role_menu_relation` VALUES ('36', '1', '24');
INSERT INTO `ums_role_menu_relation` VALUES ('37', '1', '25');

