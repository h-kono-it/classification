-- ---
-- Globals
-- ---

-- SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
-- SET FOREIGN_KEY_CHECKS=0;

-- ---
-- Table 'CLASSFICATION'
--
-- ---

DROP TABLE IF EXISTS 'CLASSFICATION';

CREATE TABLE 'CLASSFICATION' (
  'id' INTEGER NOT NULL AUTO_INCREMENT DEFAULT NULL,
  'id_分類ヘッダー' INTEGER NOT NULL DEFAULT NULL,
  '条件No' INTEGER NOT NULL DEFAULT NULL,
  '分類区分' INTEGER NOT NULL DEFAULT NULL COMMENT 'select or text',
  'CLASSFICATION名' VARCHAR NOT NULL DEFAULT 'NULL',
  PRIMARY KEY ('id')
);

-- ---
-- Table '分類アイテム条件'
--
-- ---

DROP TABLE IF EXISTS '分類アイテム条件';

CREATE TABLE '分類アイテム条件' (
  'id' INTEGER NOT NULL AUTO_INCREMENT DEFAULT NULL,
  'id_分類アイテム' INTEGER NOT NULL DEFAULT NULL,
  'id_CLASSFICATION' INTEGER NOT NULL DEFAULT NULL,
  'id_CLASSFICATION選択肢' INTEGER NOT NULL DEFAULT NULL,
  PRIMARY KEY ('id')
);

-- ---
-- Table '分類ヘッダー'
--
-- ---

DROP TABLE IF EXISTS '分類ヘッダー';

CREATE TABLE '分類ヘッダー' (
  'id' INTEGER NOT NULL AUTO_INCREMENT DEFAULT NULL,
  '分類名' VARCHAR NOT NULL,
  PRIMARY KEY ('id')
);

-- ---
-- Table '分類アイテム'
--
-- ---

DROP TABLE IF EXISTS '分類アイテム';

CREATE TABLE '分類アイテム' (
  'id' INTEGER NOT NULL AUTO_INCREMENT DEFAULT NULL,
  'id_分類ヘッダー' INTEGER NOT NULL DEFAULT NULL,
  'アイテムNo' INTEGER NOT NULL,
  'アイテム名' VARCHAR NOT NULL,
  PRIMARY KEY ('id')
);

-- ---
-- Table 'CLASSFICATION選択肢'
--
-- ---

DROP TABLE IF EXISTS 'CLASSFICATION選択肢';

CREATE TABLE 'CLASSFICATION選択肢' (
  'id' INTEGER NOT NULL AUTO_INCREMENT DEFAULT NULL,
  'id_CLASSFICATION' INTEGER NOT NULL DEFAULT NULL,
  '選択肢名' VARCHAR NULL DEFAULT NULL,
  PRIMARY KEY ('id')
);

-- ---
-- Foreign Keys
-- ---

ALTER TABLE 'CLASSFICATION' ADD FOREIGN KEY (id_分類ヘッダー) REFERENCES '分類ヘッダー' ('id');
ALTER TABLE '分類アイテム条件' ADD FOREIGN KEY (id_分類アイテム) REFERENCES '分類アイテム' ('id');
ALTER TABLE '分類アイテム条件' ADD FOREIGN KEY (id_CLASSFICATION) REFERENCES 'CLASSFICATION' ('id');
ALTER TABLE '分類アイテム条件' ADD FOREIGN KEY (id_CLASSFICATION選択肢) REFERENCES 'CLASSFICATION選択肢' ('id');
ALTER TABLE '分類アイテム' ADD FOREIGN KEY (id_分類ヘッダー) REFERENCES '分類ヘッダー' ('id');
ALTER TABLE 'CLASSFICATION選択肢' ADD FOREIGN KEY (id_CLASSFICATION) REFERENCES 'CLASSFICATION' ('id');

-- ---
-- Table Properties
-- ---

-- ALTER TABLE 'CLASSFICATION' ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE '分類アイテム条件' ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE '分類ヘッダー' ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE '分類アイテム' ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE 'CLASSFICATION選択肢' ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ---
-- Test Data
-- ---

-- INSERT INTO 'CLASSFICATION' ('id','id_分類ヘッダー','条件No','分類区分','CLASSFICATION名') VALUES
-- ('','','','','');
-- INSERT INTO '分類アイテム条件' ('id','id_分類アイテム','id_CLASSFICATION','id_CLASSFICATION選択肢') VALUES
-- ('','','','');
-- INSERT INTO '分類ヘッダー' ('id','分類名') VALUES
-- ('','');
-- INSERT INTO '分類アイテム' ('id','id_分類ヘッダー','アイテムNo','アイテム名') VALUES
-- ('','','','');
-- INSERT INTO 'CLASSFICATION選択肢' ('id','id_CLASSFICATION','選択肢名') VALUES
-- ('','','');