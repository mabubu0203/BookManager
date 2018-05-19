# 成果物：テーブル一覧(概要設計書)
==================

## 型について
カラムに設定する型については、下記を参照する。

https://www.postgresql.jp/document/10/html/datatype.html

ドメインについてはドメイン一覧を参照する。

## テーブル一覧

### 書籍登録申請
テーブル名：""

|name|type|null|default|key|
| --- | --- | --- | --- | --- | 
| id | serial | × || PK |
| 書籍情報ID | xxx | × | - | - |
| create_datetime | create_datetime_domain | × |current_timestamp| - |
| update_datetime | datetime | × |current_timestamp on update current_timestamp| - |
| update_count | update_count_domain | × | 0 | - |

### 書籍登録申請履歴
テーブル名：""

|name|type|null|default|key|
| --- | --- | --- | --- | --- | 
| id | serial | × || PK |

### 書籍登録申請ステータスマスタ
テーブル名：""

|name|type|null|default|key|
| --- | --- | --- | --- | --- | 
| id | serial | × || PK |

### 書籍情報マスタ
テーブル名：""

|name|type|null|default|key|
| --- | --- | --- | --- | --- | 
| id | serial | × || PK |



