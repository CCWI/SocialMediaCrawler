INSERT INTO `db_socialmediacrawler`.`config_serverconfig`
(`id`,
`amazon_nextrun`,
`bing_nextrun`,
`ebay_nextrun`,
`facebook_nextrun`,
`google_nextrun`,
`next_facebooksite`,
`run`,
`runtime_amazon`,
`runtime_bing`,
`runtime_ebay`,
`runtime_facebook`,
`runtime_google`,
`runtime_tumblr`,
`runtime_youtube`,
`totalruntime`,
`tumblr_nextrun`,
`youtube_nextrun`)
VALUES
(1,
'2016-07-01 09:00:00',
'2016-07-01 09:00:00',
'2016-07-01 09:00:00',
'2016-07-01 09:00:00',
'2016-07-01 09:00:00',
'60000',
1,
'60000',
'60000',
'60000',
'60000',
'60000',
'60000',
'60000',
'60000',
'2016-07-01 09:00:00',
'2016-07-01 09:00:00');
commit;