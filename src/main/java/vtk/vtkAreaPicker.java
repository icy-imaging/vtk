// java wrapper for vtkAreaPicker object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAreaPicker extends vtkAbstractPropPicker
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

  private native void SetPickCoords_4(double id0,double id1,double id2,double id3);
  public void SetPickCoords(double id0,double id1,double id2,double id3)
  {
    SetPickCoords_4(id0,id1,id2,id3);
  }

  private native void SetRenderer_5(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_5(id0);
  }

  private native int Pick_6();
  public int Pick()
  {
    return Pick_6();
  }

  private native int AreaPick_7(double id0,double id1,double id2,double id3,vtkRenderer id4);
  public int AreaPick(double id0,double id1,double id2,double id3,vtkRenderer id4)
  {
    return AreaPick_7(id0,id1,id2,id3,id4);
  }

  private native int Pick_8(double id0,double id1,double id2,vtkRenderer id3);
  public int Pick(double id0,double id1,double id2,vtkRenderer id3)
  {
    return Pick_8(id0,id1,id2,id3);
  }

  private native long GetMapper_9();
  public vtkAbstractMapper3D GetMapper()
  {
    long temp = GetMapper_9();

    if (temp == 0) return null;
    return (vtkAbstractMapper3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataSet_10();
  public vtkDataSet GetDataSet()
  {
    long temp = GetDataSet_10();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataObject_11();
  public vtkDataObject GetDataObject()
  {
    long temp = GetDataObject_11();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetProp3Ds_12();
  public vtkProp3DCollection GetProp3Ds()
  {
    long temp = GetProp3Ds_12();

    if (temp == 0) return null;
    return (vtkProp3DCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFrustum_13();
  public vtkPlanes GetFrustum()
  {
    long temp = GetFrustum_13();

    if (temp == 0) return null;
    return (vtkPlanes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetClipPoints_14();
  public vtkPoints GetClipPoints()
  {
    long temp = GetClipPoints_14();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkAreaPicker() { super(); }

  public vtkAreaPicker(long id) { super(id); }
  public native long   VTKInit();

}
