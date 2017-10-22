
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `edu_question_ware`
-- ----------------------------
DROP TABLE IF EXISTS `edu_question_ware`;
CREATE TABLE `edu_question_ware` (
  		`id` bigint(20)   NOT NULL   AUTO_INCREMENT  COMMENT '自增id',
  		`create_name` varchar(100)   NOT NULL   COMMENT '(默认)创建人',
  		`create_time` datetime   NOT NULL   COMMENT '(默认)创建时间',
  		`mod_name` varchar(100)   NULL   COMMENT '(默认)修改人',
  		`mod_time` datetime   NULL   COMMENT '(默认)修改时间',
  		`delflag` enum('0','1')  DEFAULT '0'  NOT NULL   COMMENT '(默认)删除标识',
  		`question_content` varchar(10000)   NOT NULL   COMMENT '试题内容',
  		`difficulty` decimal(10,1)   NOT NULL   COMMENT '试题难度值（取值由0到1为简单到困难）',
  		`bloom_taxonomy` enum('0','1','2','3','4','5','6')   NOT NULL   COMMENT '布鲁姆认知体系1知道，2领会，3应用，4分析，5综合，6评价',
  		`discrimination` decimal(10,1)   NOT NULL   COMMENT '区分度预估  取值-1~1 低~高',
  		`test_times` bigint(10)  DEFAULT '0'  NOT NULL   COMMENT '知识考察频数 即 组卷次数上限',
  		`answer_time` bigint(10)   NULL   COMMENT '作答时间（以分钟为单位）',
  		`is_group` enum('0','1')  DEFAULT ''0''  NOT NULL   COMMENT '是否为组合题',
  		`parent_content` varchar(2000)   NULL   COMMENT '题干内容（组合题专用）',
  		`parent_id` bigint(10)   NULL   COMMENT '组合题所属试题id',
  		`belong_to_lib` enum('1','2','3','4','5','6')   NULL   COMMENT '1考试题库,2作业题库,3錨题库,4种子题库（自适应题库）, 5个人题库（教师题库）,6专家题库 （新题库）',
  		`is_objective` enum('0','1')  DEFAULT ''0''  NULL   COMMENT '是否客观题（0否，1是）客观题 机器阅卷，主观题 人为阅卷',
  		`remark` varchar(300)   NULL   COMMENT '描述说明',
  		`is_public` enum('0','1')   NULL   COMMENT '是否公开',
  		`f_url` varchar(200)   NULL   COMMENT '音频或视频url',
  		`subject_id` bigint(10)   NOT NULL   COMMENT '学科id',
  		`grade_id` bigint(10)   NOT NULL   COMMENT '年级id',
  		`stage_id` bigint(10)   NOT NULL   COMMENT '学段id',
  		`type_id` bigint(10)   NOT NULL   COMMENT '题型id',
  		PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


