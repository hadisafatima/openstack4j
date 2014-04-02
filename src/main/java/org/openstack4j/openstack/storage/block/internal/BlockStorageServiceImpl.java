package org.openstack4j.openstack.storage.block.internal;

import org.openstack4j.api.Apis;
import org.openstack4j.api.storage.BlockStorageService;
import org.openstack4j.api.storage.BlockVolumeService;

/**
 * Block Storage (Cinder) Service Operation implementation
 * 
 * @author Jeremy Unruh
 */
public class BlockStorageServiceImpl implements BlockStorageService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockVolumeService volumes() {
		return Apis.get(BlockVolumeService.class);
	}

}
