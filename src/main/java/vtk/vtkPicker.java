// java wrapper for vtkPicker object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPicker extends vtkAbstractPropPicker
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

  private native void SetTolerance_4(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_4(id0);
  }

  private native double GetTolerance_5();
  public double GetTolerance()
  {
    return GetTolerance_5();
  }

  private native double[] GetMapperPosition_6();
  public double[] GetMapperPosition()
  {
    return GetMapperPosition_6();
  }

  private native long GetMapper_7();
  public vtkAbstractMapper3D GetMapper()
  {
    long temp = GetMapper_7();

    if (temp == 0) return null;
    return (vtkAbstractMapper3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataSet_8();
  public vtkDataSet GetDataSet()
  {
    long temp = GetDataSet_8();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCompositeDataSet_9();
  public vtkCompositeDataSet GetCompositeDataSet()
  {
    long temp = GetCompositeDataSet_9();

    if (temp == 0) return null;
    return (vtkCompositeDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFlatBlockIndex_10();
  public long GetFlatBlockIndex()
  {
    return GetFlatBlockIndex_10();
  }

  private native long GetProp3Ds_11();
  public vtkProp3DCollection GetProp3Ds()
  {
    long temp = GetProp3Ds_11();

    if (temp == 0) return null;
    return (vtkProp3DCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetActors_12();
  public vtkActorCollection GetActors()
  {
    long temp = GetActors_12();

    if (temp == 0) return null;
    return (vtkActorCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPickedPositions_13();
  public vtkPoints GetPickedPositions()
  {
    long temp = GetPickedPositions_13();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int Pick_14(double id0,double id1,double id2,vtkRenderer id3);
  public int Pick(double id0,double id1,double id2,vtkRenderer id3)
  {
    return Pick_14(id0,id1,id2,id3);
  }

  private native int Pick_15(double id0[],vtkRenderer id1);
  public int Pick(double id0[],vtkRenderer id1)
  {
    return Pick_15(id0,id1);
  }

  private native int Pick3DPoint_16(double id0[],vtkRenderer id1);
  public int Pick3DPoint(double id0[],vtkRenderer id1)
  {
    return Pick3DPoint_16(id0,id1);
  }

  private native int Pick3DPoint_17(double id0[],double id1[],vtkRenderer id2);
  public int Pick3DPoint(double id0[],double id1[],vtkRenderer id2)
  {
    return Pick3DPoint_17(id0,id1,id2);
  }

  private native int Pick3DRay_18(double id0[],double id1[],vtkRenderer id2);
  public int Pick3DRay(double id0[],double id1[],vtkRenderer id2)
  {
    return Pick3DRay_18(id0,id1,id2);
  }

  public vtkPicker() { super(); }

  public vtkPicker(long id) { super(id); }
  public native long   VTKInit();

}
