# 成果物：ドメイン一覧(概要設計書)
==================

## ドメインについて
ドメインについての説明は下記リファレンスを参照する。

https://www.postgresql.jp/document/10/html/extend-type-system.html#EXTEND-TYPE-SYSTEM-DOMAINS

https://www.postgresql.jp/document/10/html/sql-createdomain.html

## ドメイン一覧

### テーブル共通

|name|data_type|default|null|check|
| --- | --- | --- | --- | --- |
|create_datetime_domain|timestamp| --- |×| --- |
|update_datetime_domain|timestamp| --- |×| --- |
|update_count_domain|smallint(4)| --- |×| --- |

### 名称

|name|data_type|default|null|check|
| --- | --- | --- | --- | --- |
|author_name_domain|character varying(1024)| --- |○| --- |
|book_name_domain|character varying(1024)| --- |○| --- |
|person_name_domain|character varying(64)| --- |○| --- |

### その他

|name|data_type|default|null|check|
| --- | --- | --- | --- | --- |
|isbn_domain|character varying(64)| --- |×| --- |
|price_domain|money| --- |×| --- |



