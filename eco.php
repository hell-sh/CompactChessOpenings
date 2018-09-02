<?php
foreach(json_decode(file_get_contents("eco.json")) as $opening)
{
	$cfen = str_replace("/", "", $opening->f);
	echo "openings.add(new Opening(\"{$opening->c}\", \"{$opening->n}\", \"{$cfen}\"));\n";
}
