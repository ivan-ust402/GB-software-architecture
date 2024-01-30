package homework1.InMemoryModel;

import homework1.ModelElements.Camera;
import homework1.ModelElements.Flash;
import homework1.ModelElements.PoligonalModel;
import homework1.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changedObservers;

    public ModelStore (){

    }

    public void NotifyChange(IModelChanger sender) {

    }

//    public ModelStore(List<IModelChangedObserver> changedObserver)

}
