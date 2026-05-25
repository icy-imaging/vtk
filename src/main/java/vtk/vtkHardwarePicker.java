// java wrapper for vtkHardwarePicker object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHardwarePicker extends vtkAbstractPropPicker
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

  private native void SetSnapToMeshPoint_4(boolean id0);
  public void SetSnapToMeshPoint(boolean id0)
  {
    SetSnapToMeshPoint_4(id0);
  }

  private native boolean GetSnapToMeshPoint_5();
  public boolean GetSnapToMeshPoint()
  {
    return GetSnapToMeshPoint_5();
  }

  private native void SnapToMeshPointOn_6();
  public void SnapToMeshPointOn()
  {
    SnapToMeshPointOn_6();
  }

  private native void SnapToMeshPointOff_7();
  public void SnapToMeshPointOff()
  {
    SnapToMeshPointOff_7();
  }

  private native void SetPixelTolerance_8(int id0);
  public void SetPixelTolerance(int id0)
  {
    SetPixelTolerance_8(id0);
  }

  private native int GetPixelTolerance_9();
  public int GetPixelTolerance()
  {
    return GetPixelTolerance_9();
  }

  private native long GetMapper_10();
  public vtkAbstractMapper3D GetMapper()
  {
    long temp = GetMapper_10();

    if (temp == 0) return null;
    return (vtkAbstractMapper3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataSet_11();
  public vtkDataSet GetDataSet()
  {
    long temp = GetDataSet_11();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataObject_12();
  public vtkDataObject GetDataObject()
  {
    long temp = GetDataObject_12();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCompositeDataSet_13();
  public vtkCompositeDataSet GetCompositeDataSet()
  {
    long temp = GetCompositeDataSet_13();

    if (temp == 0) return null;
    return (vtkCompositeDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFlatBlockIndex_14();
  public long GetFlatBlockIndex()
  {
    return GetFlatBlockIndex_14();
  }

  private native long GetPointId_15();
  public long GetPointId()
  {
    return GetPointId_15();
  }

  private native long GetCellId_16();
  public long GetCellId()
  {
    return GetCellId_16();
  }

  private native int GetSubId_17();
  public int GetSubId()
  {
    return GetSubId_17();
  }

  private native long GetCellGridCellTypeId_18();
  public long GetCellGridCellTypeId()
  {
    return GetCellGridCellTypeId_18();
  }

  private native long GetCellGridSourceSpecId_19();
  public long GetCellGridSourceSpecId()
  {
    return GetCellGridSourceSpecId_19();
  }

  private native long GetCellGridTupleId_20();
  public long GetCellGridTupleId()
  {
    return GetCellGridTupleId_20();
  }

  private native double[] GetPCoords_21();
  public double[] GetPCoords()
  {
    return GetPCoords_21();
  }

  private native double[] GetPickNormal_22();
  public double[] GetPickNormal()
  {
    return GetPickNormal_22();
  }

  private native boolean GetNormalFlipped_23();
  public boolean GetNormalFlipped()
  {
    return GetNormalFlipped_23();
  }

  private native int Pick_24(double id0,double id1,double id2,vtkRenderer id3);
  public int Pick(double id0,double id1,double id2,vtkRenderer id3)
  {
    return Pick_24(id0,id1,id2,id3);
  }

  public vtkHardwarePicker() { super(); }

  public vtkHardwarePicker(long id) { super(id); }
  public native long   VTKInit();

}
