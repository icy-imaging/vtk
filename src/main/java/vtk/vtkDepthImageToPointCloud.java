// java wrapper for vtkDepthImageToPointCloud object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDepthImageToPointCloud extends vtkPolyDataAlgorithm
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

  private native void SetCamera_5(vtkCamera id0);
  public void SetCamera(vtkCamera id0)
  {
    SetCamera_5(id0);
  }

  private native long GetCamera_6();
  public vtkCamera GetCamera()
  {
    long temp = GetCamera_6();

    if (temp == 0) return null;
    return (vtkCamera)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCullNearPoints_7(boolean id0);
  public void SetCullNearPoints(boolean id0)
  {
    SetCullNearPoints_7(id0);
  }

  private native boolean GetCullNearPoints_8();
  public boolean GetCullNearPoints()
  {
    return GetCullNearPoints_8();
  }

  private native void CullNearPointsOn_9();
  public void CullNearPointsOn()
  {
    CullNearPointsOn_9();
  }

  private native void CullNearPointsOff_10();
  public void CullNearPointsOff()
  {
    CullNearPointsOff_10();
  }

  private native void SetCullFarPoints_11(boolean id0);
  public void SetCullFarPoints(boolean id0)
  {
    SetCullFarPoints_11(id0);
  }

  private native boolean GetCullFarPoints_12();
  public boolean GetCullFarPoints()
  {
    return GetCullFarPoints_12();
  }

  private native void CullFarPointsOn_13();
  public void CullFarPointsOn()
  {
    CullFarPointsOn_13();
  }

  private native void CullFarPointsOff_14();
  public void CullFarPointsOff()
  {
    CullFarPointsOff_14();
  }

  private native void SetProduceColorScalars_15(boolean id0);
  public void SetProduceColorScalars(boolean id0)
  {
    SetProduceColorScalars_15(id0);
  }

  private native boolean GetProduceColorScalars_16();
  public boolean GetProduceColorScalars()
  {
    return GetProduceColorScalars_16();
  }

  private native void ProduceColorScalarsOn_17();
  public void ProduceColorScalarsOn()
  {
    ProduceColorScalarsOn_17();
  }

  private native void ProduceColorScalarsOff_18();
  public void ProduceColorScalarsOff()
  {
    ProduceColorScalarsOff_18();
  }

  private native void SetProduceVertexCellArray_19(boolean id0);
  public void SetProduceVertexCellArray(boolean id0)
  {
    SetProduceVertexCellArray_19(id0);
  }

  private native boolean GetProduceVertexCellArray_20();
  public boolean GetProduceVertexCellArray()
  {
    return GetProduceVertexCellArray_20();
  }

  private native void ProduceVertexCellArrayOn_21();
  public void ProduceVertexCellArrayOn()
  {
    ProduceVertexCellArrayOn_21();
  }

  private native void ProduceVertexCellArrayOff_22();
  public void ProduceVertexCellArrayOff()
  {
    ProduceVertexCellArrayOff_22();
  }

  private native void SetOutputPointsPrecision_23(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_23(id0);
  }

  private native int GetOutputPointsPrecision_24();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_24();
  }

  public vtkDepthImageToPointCloud() { super(); }

  public vtkDepthImageToPointCloud(long id) { super(id); }
  public native long   VTKInit();

}
