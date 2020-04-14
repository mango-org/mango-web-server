<?php

namespace php\http;

use compress\Archive;
use php\io\Stream;

class HttpPart
{
    /**
     * @return Stream
     */
    public function stream(): Stream {}

    /**
     * @param string $path
     */
    public function write(string $path) {}

    /**
     * @return string
     */
    public function getName(): string {}

    /**
     * @return string
     */
    public function getContentType(): string {}

    /**
     * @return string
     */
    public function getSubmittedFileName(): string {}

    /**
     * @return int
     */
    public function getSize(): int {}
}
