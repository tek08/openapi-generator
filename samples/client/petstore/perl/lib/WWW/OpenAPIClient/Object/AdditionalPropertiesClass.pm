=begin comment

OpenAPI Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::Object::AdditionalPropertiesClass;

require 5.6.0;
use strict;
use warnings;
use utf8;
use JSON qw(decode_json);
use Data::Dumper;
use Module::Runtime qw(use_module);
use Log::Any qw($log);
use Date::Parse;
use DateTime;


use base ("Class::Accessor", "Class::Data::Inheritable");

#
#
#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech). Do not edit the class manually.
# REF: https://openapi-generator.tech
#

=begin comment

OpenAPI Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
__PACKAGE__->mk_classdata('attribute_map' => {});
__PACKAGE__->mk_classdata('openapi_types' => {});
__PACKAGE__->mk_classdata('method_documentation' => {}); 
__PACKAGE__->mk_classdata('class_documentation' => {});

# new plain object
sub new { 
    my ($class, %args) = @_; 

    my $self = bless {}, $class;

    $self->init(%args);
    
    return $self;
}

# initialize the object
sub init
{
    my ($self, %args) = @_;

    foreach my $attribute (keys %{$self->attribute_map}) {
        my $args_key = $self->attribute_map->{$attribute};
        $self->$attribute( $args{ $args_key } );
    }
}

# return perl hash
sub to_hash {
    my $self = shift;
    my $_hash = decode_json(JSON->new->convert_blessed->encode($self));

    return $_hash;
}

# used by JSON for serialization
sub TO_JSON { 
    my $self = shift;
    my $_data = {};
    foreach my $_key (keys %{$self->attribute_map}) {
        if (defined $self->{$_key}) {
            $_data->{$self->attribute_map->{$_key}} = $self->{$_key};
        }
    }

    return $_data;
}

# from Perl hashref
sub from_hash {
    my ($self, $hash) = @_;

    # loop through attributes and use openapi_types to deserialize the data
    while ( my ($_key, $_type) = each %{$self->openapi_types} ) {
        my $_json_attribute = $self->attribute_map->{$_key}; 
        if ($_type =~ /^array\[(.+)\]$/i) { # array
            my $_subclass = $1;
            my @_array = ();
            foreach my $_element (@{$hash->{$_json_attribute}}) {
                push @_array, $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \@_array;
        } elsif ($_type =~ /^hash\[string,(.+)\]$/i) { # hash
            my $_subclass = $1;
            my %_hash = ();
            while (my($_key, $_element) = each %{$hash->{$_json_attribute}}) {
                $_hash{$_key} = $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \%_hash;
        } elsif (exists $hash->{$_json_attribute}) { #hash(model), primitive, datetime
            $self->{$_key} = $self->_deserialize($_type, $hash->{$_json_attribute});
        } else {
            $log->debugf("Warning: %s (%s) does not exist in input hash\n", $_key, $_json_attribute);
        }
    }
  
    return $self;
}

# deserialize non-array data
sub _deserialize {
    my ($self, $type, $data) = @_;
    $log->debugf("deserializing %s with %s",Dumper($data), $type);

    if ($type eq 'DateTime') {
        return DateTime->from_epoch(epoch => str2time($data));
    } elsif ( grep( /^$type$/, ('int', 'double', 'string', 'boolean'))) {
        return $data;
    } else { # hash(model)
        my $_instance = eval "WWW::OpenAPIClient::Object::$type->new()";
        return $_instance->from_hash($data);
    }
}



__PACKAGE__->class_documentation({description => '',
                                  class => 'AdditionalPropertiesClass',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
<<<<<<< HEAD
    'map_property' => {
        datatype => 'HASH[string,string]',
        base_name => 'map_property',
=======
    'map_string' => {
        datatype => 'HASH[string,string]',
        base_name => 'map_string',
>>>>>>> ooof
        description => '',
        format => '',
        read_only => '',
            },
<<<<<<< HEAD
    'map_of_map_property' => {
        datatype => 'HASH[string,HASH[string,string]]',
        base_name => 'map_of_map_property',
=======
    'map_number' => {
        datatype => 'HASH[string,double]',
        base_name => 'map_number',
        description => '',
        format => '',
        read_only => '',
            },
    'map_integer' => {
        datatype => 'HASH[string,int]',
        base_name => 'map_integer',
        description => '',
        format => '',
        read_only => '',
            },
    'map_boolean' => {
        datatype => 'HASH[string,boolean]',
        base_name => 'map_boolean',
        description => '',
        format => '',
        read_only => '',
            },
    'map_array_integer' => {
        datatype => 'HASH[string,ARRAY[int]]',
        base_name => 'map_array_integer',
        description => '',
        format => '',
        read_only => '',
            },
    'map_array_anytype' => {
        datatype => 'HASH[string,ARRAY[object]]',
        base_name => 'map_array_anytype',
        description => '',
        format => '',
        read_only => '',
            },
    'map_map_string' => {
        datatype => 'HASH[string,HASH[string,string]]',
        base_name => 'map_map_string',
        description => '',
        format => '',
        read_only => '',
            },
    'map_map_anytype' => {
        datatype => 'HASH[string,HASH[string,object]]',
        base_name => 'map_map_anytype',
        description => '',
        format => '',
        read_only => '',
            },
    'anytype_1' => {
        datatype => 'object',
        base_name => 'anytype_1',
        description => '',
        format => '',
        read_only => '',
            },
    'anytype_2' => {
        datatype => 'object',
        base_name => 'anytype_2',
        description => '',
        format => '',
        read_only => '',
            },
    'anytype_3' => {
        datatype => 'object',
        base_name => 'anytype_3',
>>>>>>> ooof
        description => '',
        format => '',
        read_only => '',
            },
});

__PACKAGE__->openapi_types( {
<<<<<<< HEAD
    'map_property' => 'HASH[string,string]',
    'map_of_map_property' => 'HASH[string,HASH[string,string]]'
} );

__PACKAGE__->attribute_map( {
    'map_property' => 'map_property',
    'map_of_map_property' => 'map_of_map_property'
=======
    'map_string' => 'HASH[string,string]',
    'map_number' => 'HASH[string,double]',
    'map_integer' => 'HASH[string,int]',
    'map_boolean' => 'HASH[string,boolean]',
    'map_array_integer' => 'HASH[string,ARRAY[int]]',
    'map_array_anytype' => 'HASH[string,ARRAY[object]]',
    'map_map_string' => 'HASH[string,HASH[string,string]]',
    'map_map_anytype' => 'HASH[string,HASH[string,object]]',
    'anytype_1' => 'object',
    'anytype_2' => 'object',
    'anytype_3' => 'object'
} );

__PACKAGE__->attribute_map( {
    'map_string' => 'map_string',
    'map_number' => 'map_number',
    'map_integer' => 'map_integer',
    'map_boolean' => 'map_boolean',
    'map_array_integer' => 'map_array_integer',
    'map_array_anytype' => 'map_array_anytype',
    'map_map_string' => 'map_map_string',
    'map_map_anytype' => 'map_map_anytype',
    'anytype_1' => 'anytype_1',
    'anytype_2' => 'anytype_2',
    'anytype_3' => 'anytype_3'
>>>>>>> ooof
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
