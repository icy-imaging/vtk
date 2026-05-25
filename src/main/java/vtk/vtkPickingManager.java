// java wrapper for vtkPickingManager object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPickingManager extends vtkObject
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void EnabledOn_4();
  public void EnabledOn()
  {
    EnabledOn_4();
  }

  private native void EnabledOff_5();
  public void EnabledOff()
  {
    EnabledOff_5();
  }

  private native void SetEnabled_6(boolean id0);
  public void SetEnabled(boolean id0)
  {
    SetEnabled_6(id0);
  }

  private native boolean GetEnabled_7();
  public boolean GetEnabled()
  {
    return GetEnabled_7();
  }

  private native void SetOptimizeOnInteractorEvents_8(boolean id0);
  public void SetOptimizeOnInteractorEvents(boolean id0)
  {
    SetOptimizeOnInteractorEvents_8(id0);
  }

  private native boolean GetOptimizeOnInteractorEvents_9();
  public boolean GetOptimizeOnInteractorEvents()
  {
    return GetOptimizeOnInteractorEvents_9();
  }

  private native void SetInteractor_10(vtkRenderWindowInteractor id0);
  public void SetInteractor(vtkRenderWindowInteractor id0)
  {
    SetInteractor_10(id0);
  }

  private native long GetInteractor_11();
  public vtkRenderWindowInteractor GetInteractor()
  {
    long temp = GetInteractor_11();

    if (temp == 0) return null;
    return (vtkRenderWindowInteractor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AddPicker_12(vtkAbstractPicker id0,vtkObject id1);
  public void AddPicker(vtkAbstractPicker id0,vtkObject id1)
  {
    AddPicker_12(id0,id1);
  }

  private native void RemovePicker_13(vtkAbstractPicker id0,vtkObject id1);
  public void RemovePicker(vtkAbstractPicker id0,vtkObject id1)
  {
    RemovePicker_13(id0,id1);
  }

  private native void RemoveObject_14(vtkObject id0);
  public void RemoveObject(vtkObject id0)
  {
    RemoveObject_14(id0);
  }

  private native boolean Pick_15(vtkAbstractPicker id0,vtkObject id1);
  public boolean Pick(vtkAbstractPicker id0,vtkObject id1)
  {
    return Pick_15(id0,id1);
  }

  private native boolean Pick_16(vtkObject id0);
  public boolean Pick(vtkObject id0)
  {
    return Pick_16(id0);
  }

  private native boolean Pick_17(vtkAbstractPicker id0);
  public boolean Pick(vtkAbstractPicker id0)
  {
    return Pick_17(id0);
  }

  private native long GetAssemblyPath_18(double id0,double id1,double id2,vtkAbstractPropPicker id3,vtkRenderer id4,vtkObject id5);
  public vtkAssemblyPath GetAssemblyPath(double id0,double id1,double id2,vtkAbstractPropPicker id3,vtkRenderer id4,vtkObject id5)
  {
    long temp = GetAssemblyPath_18(id0,id1,id2,id3,id4,id5);

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfPickers_19();
  public int GetNumberOfPickers()
  {
    return GetNumberOfPickers_19();
  }

  private native int GetNumberOfObjectsLinked_20(vtkAbstractPicker id0);
  public int GetNumberOfObjectsLinked(vtkAbstractPicker id0)
  {
    return GetNumberOfObjectsLinked_20(id0);
  }

  public vtkPickingManager() { super(); }

  public vtkPickingManager(long id) { super(id); }
  public native long   VTKInit();

}
