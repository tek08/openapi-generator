<?php

namespace OpenAPI\Client;

use OpenAPI\Client\Model\EnumTest;
use OpenAPI\Client\Model\OuterEnum;
use PHPUnit\Framework\TestCase;

class OuterEnumTest extends TestCase
{
    public function testDeserialize()
    {
        $result = ObjectSerializer::deserialize(
            "placed",
            OuterEnum::class
        );

<<<<<<< HEAD
        $this->assertIsString($result);
        $this->assertEquals('placed', $result);
    }

    public function testDeserializeInvalidValue()
    {
        $this->expectException(\InvalidArgumentException::class);
        $this->expectExceptionMessage('Invalid value for enum');
=======
        $this->assertInternalType('string', $result);
        $this->assertEquals('placed', $result);
    }

    /**
     * @expectedException \InvalidArgumentException
     * @expectedExceptionMessage Invalid value for enum
     */
    public function testDeserializeInvalidValue()
    {
>>>>>>> ooof
        ObjectSerializer::deserialize(
            "lkjfalgkdfjg",
            OuterEnum::class
        );
    }

    public function testDeserializeNested()
    {
        $json = '{
            "enum_string": "UPPER",
            "enum_integer": -1,
            "enum_number": -1.2, 
            "outerEnum": "approved"
        }';

        /** * @var EnumTest $result */
        $result = ObjectSerializer::deserialize(
            json_decode($json),
            EnumTest::class
        );

        $this->assertInstanceOf(EnumTest::class, $result);
        $this->assertEquals('approved', $result->getOuterEnum());
    }

    public function testSanitize()
    {
        $json = "placed";

        $result = ObjectSerializer::sanitizeForSerialization(
            $json
        );

<<<<<<< HEAD
        $this->assertIsString($result);
=======
        $this->assertInternalType('string', $result);
>>>>>>> ooof
    }

    public function testSanitizeNested()
    {
        $input = new EnumTest([
            'enum_string' => 'UPPER',
            'enum_integer' => -1,
            'enum_number' => -1.2,
            'outer_enum' => 'approved'
        ]);

        $result = ObjectSerializer::sanitizeForSerialization(
            $input
        );

<<<<<<< HEAD
        $this->assertIsObject($result);
        $this->assertInstanceOf(\stdClass::class, $result);

        $this->assertIsString($result->outerEnum);
        $this->assertEquals('approved', $result->outerEnum);
    }

    public function testSanitizeNestedInvalidValue()
    {
        $this->expectException(\InvalidArgumentException::class);
        $this->expectExceptionMessage('Invalid value for enum');
=======
        $this->assertInternalType('object', $result);
        $this->assertInstanceOf(\stdClass::class, $result);

        $this->assertInternalType('string', $result->outerEnum);
        $this->assertEquals('approved', $result->outerEnum);
    }

    /**
     * @expectedException \InvalidArgumentException
     * @expectedExceptionMessage Invalid value for enum
     */
    public function testSanitizeNestedInvalidValue()
    {
>>>>>>> ooof
        $input = new EnumTest([
            'enum_string' => 'UPPER',
            'enum_integer' => -1,
            'enum_number' => -1.2,
            'outer_enum' => 'invalid_value'
        ]);

        ObjectSerializer::sanitizeForSerialization($input);
    }
}
