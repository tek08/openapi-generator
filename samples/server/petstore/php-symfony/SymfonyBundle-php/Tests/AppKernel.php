<?php

<<<<<<< HEAD
namespace OpenAPI\Server\Tests;

use Symfony\Bundle\FrameworkBundle\FrameworkBundle;
=======
>>>>>>> ooof
use Symfony\Component\HttpKernel\Kernel;
use Symfony\Component\Config\Loader\LoaderInterface;

class AppKernel extends Kernel
{
    public function registerBundles()
    {
        $bundles = array(
<<<<<<< HEAD
            new FrameworkBundle()
=======
            new Symfony\Bundle\FrameworkBundle\FrameworkBundle()
>>>>>>> ooof
        );

        return $bundles;
    }

    public function registerContainerConfiguration(LoaderInterface $loader)
    {
        $loader->load(__DIR__.'/test_config.yml');
    }
}
