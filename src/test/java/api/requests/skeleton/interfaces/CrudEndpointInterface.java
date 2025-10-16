package api.requests.skeleton.interfaces;

import api.models.BaseModel;

public interface CrudEndpointInterface {
    Object post(BaseModel model);
    Object get(Class<?> clazz);
    Object update(long id, BaseModel model);
    Object delete(long id);
}
