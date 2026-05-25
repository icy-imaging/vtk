// java wrapper for vtkPolyDataPointSampler object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyDataPointSampler extends vtkPolyDataAlgorithm
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

  private native void SetDistance_4(double id0);
  public void SetDistance(double id0)
  {
    SetDistance_4(id0);
  }

  private native double GetDistanceMinValue_5();
  public double GetDistanceMinValue()
  {
    return GetDistanceMinValue_5();
  }

  private native double GetDistanceMaxValue_6();
  public double GetDistanceMaxValue()
  {
    return GetDistanceMaxValue_6();
  }

  private native double GetDistance_7();
  public double GetDistance()
  {
    return GetDistance_7();
  }

  private native void SetPointGenerationMode_8(int id0);
  public void SetPointGenerationMode(int id0)
  {
    SetPointGenerationMode_8(id0);
  }

  private native int GetPointGenerationModeMinValue_9();
  public int GetPointGenerationModeMinValue()
  {
    return GetPointGenerationModeMinValue_9();
  }

  private native int GetPointGenerationModeMaxValue_10();
  public int GetPointGenerationModeMaxValue()
  {
    return GetPointGenerationModeMaxValue_10();
  }

  private native int GetPointGenerationMode_11();
  public int GetPointGenerationMode()
  {
    return GetPointGenerationMode_11();
  }

  private native void SetPointGenerationModeToRegular_12();
  public void SetPointGenerationModeToRegular()
  {
    SetPointGenerationModeToRegular_12();
  }

  private native void SetPointGenerationModeToRandom_13();
  public void SetPointGenerationModeToRandom()
  {
    SetPointGenerationModeToRandom_13();
  }

  private native boolean GetGenerateVertexPoints_14();
  public boolean GetGenerateVertexPoints()
  {
    return GetGenerateVertexPoints_14();
  }

  private native void SetGenerateVertexPoints_15(boolean id0);
  public void SetGenerateVertexPoints(boolean id0)
  {
    SetGenerateVertexPoints_15(id0);
  }

  private native void GenerateVertexPointsOn_16();
  public void GenerateVertexPointsOn()
  {
    GenerateVertexPointsOn_16();
  }

  private native void GenerateVertexPointsOff_17();
  public void GenerateVertexPointsOff()
  {
    GenerateVertexPointsOff_17();
  }

  private native boolean GetGenerateEdgePoints_18();
  public boolean GetGenerateEdgePoints()
  {
    return GetGenerateEdgePoints_18();
  }

  private native void SetGenerateEdgePoints_19(boolean id0);
  public void SetGenerateEdgePoints(boolean id0)
  {
    SetGenerateEdgePoints_19(id0);
  }

  private native void GenerateEdgePointsOn_20();
  public void GenerateEdgePointsOn()
  {
    GenerateEdgePointsOn_20();
  }

  private native void GenerateEdgePointsOff_21();
  public void GenerateEdgePointsOff()
  {
    GenerateEdgePointsOff_21();
  }

  private native boolean GetGenerateInteriorPoints_22();
  public boolean GetGenerateInteriorPoints()
  {
    return GetGenerateInteriorPoints_22();
  }

  private native void SetGenerateInteriorPoints_23(boolean id0);
  public void SetGenerateInteriorPoints(boolean id0)
  {
    SetGenerateInteriorPoints_23(id0);
  }

  private native void GenerateInteriorPointsOn_24();
  public void GenerateInteriorPointsOn()
  {
    GenerateInteriorPointsOn_24();
  }

  private native void GenerateInteriorPointsOff_25();
  public void GenerateInteriorPointsOff()
  {
    GenerateInteriorPointsOff_25();
  }

  private native boolean GetGenerateVertices_26();
  public boolean GetGenerateVertices()
  {
    return GetGenerateVertices_26();
  }

  private native void SetGenerateVertices_27(boolean id0);
  public void SetGenerateVertices(boolean id0)
  {
    SetGenerateVertices_27(id0);
  }

  private native void GenerateVerticesOn_28();
  public void GenerateVerticesOn()
  {
    GenerateVerticesOn_28();
  }

  private native void GenerateVerticesOff_29();
  public void GenerateVerticesOff()
  {
    GenerateVerticesOff_29();
  }

  private native boolean GetInterpolatePointData_30();
  public boolean GetInterpolatePointData()
  {
    return GetInterpolatePointData_30();
  }

  private native void SetInterpolatePointData_31(boolean id0);
  public void SetInterpolatePointData(boolean id0)
  {
    SetInterpolatePointData_31(id0);
  }

  private native void InterpolatePointDataOn_32();
  public void InterpolatePointDataOn()
  {
    InterpolatePointDataOn_32();
  }

  private native void InterpolatePointDataOff_33();
  public void InterpolatePointDataOff()
  {
    InterpolatePointDataOff_33();
  }

  public vtkPolyDataPointSampler() { super(); }

  public vtkPolyDataPointSampler(long id) { super(id); }
  public native long   VTKInit();

}
