// java wrapper for vtkAbstractMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractMapper extends vtkAlgorithm
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void ReleaseGraphicsResources_5(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_5(id0);
  }

  private native double GetTimeToDraw_6();
  public double GetTimeToDraw()
  {
    return GetTimeToDraw_6();
  }

  private native void AddClippingPlane_7(vtkPlane id0);
  public void AddClippingPlane(vtkPlane id0)
  {
    AddClippingPlane_7(id0);
  }

  private native void RemoveClippingPlane_8(vtkPlane id0);
  public void RemoveClippingPlane(vtkPlane id0)
  {
    RemoveClippingPlane_8(id0);
  }

  private native void RemoveAllClippingPlanes_9();
  public void RemoveAllClippingPlanes()
  {
    RemoveAllClippingPlanes_9();
  }

  private native void SetClippingPlanes_10(vtkPlaneCollection id0);
  public void SetClippingPlanes(vtkPlaneCollection id0)
  {
    SetClippingPlanes_10(id0);
  }

  private native long GetClippingPlanes_11();
  public vtkPlaneCollection GetClippingPlanes()
  {
    long temp = GetClippingPlanes_11();

    if (temp == 0) return null;
    return (vtkPlaneCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetClippingPlanes_12(vtkPlanes id0);
  public void SetClippingPlanes(vtkPlanes id0)
  {
    SetClippingPlanes_12(id0);
  }

  private native void ShallowCopy_13(vtkAbstractMapper id0);
  public void ShallowCopy(vtkAbstractMapper id0)
  {
    ShallowCopy_13(id0);
  }

  private native int GetNumberOfClippingPlanes_14();
  public int GetNumberOfClippingPlanes()
  {
    return GetNumberOfClippingPlanes_14();
  }

  public vtkAbstractMapper() { super(); }

  public vtkAbstractMapper(long id) { super(id); }

}
