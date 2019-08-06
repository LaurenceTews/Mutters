package com.rabidgremlin.mutters.slots;

/**
 * An interface for a slot that has a default value, for cases when no slot value is found.
 *
 * @author foskic
 * @author tewsl
 */
public interface DefaultValueSlot {

    default Object getDefaultValue() { return ""; }

}
