// java wrapper for vtkGenericCellTessellator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericCellTessellator extends vtkObject
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

  private native void TessellateFace_4(vtkGenericAdaptorCell id0,vtkGenericAttributeCollection id1,long id2,vtkDoubleArray id3,vtkCellArray id4,vtkPointData id5);
  public void TessellateFace(vtkGenericAdaptorCell id0,vtkGenericAttributeCollection id1,long id2,vtkDoubleArray id3,vtkCellArray id4,vtkPointData id5)
  {
    TessellateFace_4(id0,id1,id2,id3,id4,id5);
  }

  private native void Tessellate_5(vtkGenericAdaptorCell id0,vtkGenericAttributeCollection id1,vtkDoubleArray id2,vtkCellArray id3,vtkPointData id4);
  public void Tessellate(vtkGenericAdaptorCell id0,vtkGenericAttributeCollection id1,vtkDoubleArray id2,vtkCellArray id3,vtkPointData id4)
  {
    Tessellate_5(id0,id1,id2,id3,id4);
  }

  private native void Triangulate_6(vtkGenericAdaptorCell id0,vtkGenericAttributeCollection id1,vtkDoubleArray id2,vtkCellArray id3,vtkPointData id4);
  public void Triangulate(vtkGenericAdaptorCell id0,vtkGenericAttributeCollection id1,vtkDoubleArray id2,vtkCellArray id3,vtkPointData id4)
  {
    Triangulate_6(id0,id1,id2,id3,id4);
  }

  private native void SetErrorMetrics_7(vtkCollection id0);
  public void SetErrorMetrics(vtkCollection id0)
  {
    SetErrorMetrics_7(id0);
  }

  private native long GetErrorMetrics_8();
  public vtkCollection GetErrorMetrics()
  {
    long temp = GetErrorMetrics_8();

    if (temp == 0) return null;
    return (vtkCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Initialize_9(vtkGenericDataSet id0);
  public void Initialize(vtkGenericDataSet id0)
  {
    Initialize_9(id0);
  }

  private native void InitErrorMetrics_10(vtkGenericDataSet id0);
  public void InitErrorMetrics(vtkGenericDataSet id0)
  {
    InitErrorMetrics_10(id0);
  }

  private native int GetMeasurement_11();
  public int GetMeasurement()
  {
    return GetMeasurement_11();
  }

  private native void SetMeasurement_12(int id0);
  public void SetMeasurement(int id0)
  {
    SetMeasurement_12(id0);
  }

  public vtkGenericCellTessellator() { super(); }

  public vtkGenericCellTessellator(long id) { super(id); }

}
