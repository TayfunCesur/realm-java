package io.realm.internal.sync.permissions;

import io.realm.annotations.RealmModule;
import io.realm.sync.permissions.ClassPermissions;
import io.realm.sync.permissions.RealmPermission;
import io.realm.sync.permissions.RealmPermissions;
import io.realm.sync.permissions.PermissionUser;
import io.realm.sync.permissions.Role;

@RealmModule(library = true, classes = {
        ClassPermissions.class,
        RealmPermission.class,
        RealmPermissions.class,
        Role.class,
        PermissionUser.class
})
public class ObjectPermissionsModule {
}
