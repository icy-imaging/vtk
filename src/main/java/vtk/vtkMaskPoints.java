// java wrapper for vtkMaskPoints object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMaskPoints extends vtkPolyDataAlgorithm
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

  private native void SetOnRatio_4(int id0);
  public void SetOnRatio(int id0)
  {
    SetOnRatio_4(id0);
  }

  private native int GetOnRatioMinValue_5();
  public int GetOnRatioMinValue()
  {
    return GetOnRatioMinValue_5();
  }

  private native int GetOnRatioMaxValue_6();
  public int GetOnRatioMaxValue()
  {
    return GetOnRatioMaxValue_6();
  }

  private native int GetOnRatio_7();
  public int GetOnRatio()
  {
    return GetOnRatio_7();
  }

  private native void SetMaximumNumberOfPoints_8(long id0);
  public void SetMaximumNumberOfPoints(long id0)
  {
    SetMaximumNumberOfPoints_8(id0);
  }

  private native long GetMaximumNumberOfPointsMinValue_9();
  public long GetMaximumNumberOfPointsMinValue()
  {
    return GetMaximumNumberOfPointsMinValue_9();
  }

  private native long GetMaximumNumberOfPointsMaxValue_10();
  public long GetMaximumNumberOfPointsMaxValue()
  {
    return GetMaximumNumberOfPointsMaxValue_10();
  }

  private native long GetMaximumNumberOfPoints_11();
  public long GetMaximumNumberOfPoints()
  {
    return GetMaximumNumberOfPoints_11();
  }

  private native void SetOffset_12(long id0);
  public void SetOffset(long id0)
  {
    SetOffset_12(id0);
  }

  private native long GetOffsetMinValue_13();
  public long GetOffsetMinValue()
  {
    return GetOffsetMinValue_13();
  }

  private native long GetOffsetMaxValue_14();
  public long GetOffsetMaxValue()
  {
    return GetOffsetMaxValue_14();
  }

  private native long GetOffset_15();
  public long GetOffset()
  {
    return GetOffset_15();
  }

  private native void SetRandomMode_16(boolean id0);
  public void SetRandomMode(boolean id0)
  {
    SetRandomMode_16(id0);
  }

  private native boolean GetRandomMode_17();
  public boolean GetRandomMode()
  {
    return GetRandomMode_17();
  }

  private native void RandomModeOn_18();
  public void RandomModeOn()
  {
    RandomModeOn_18();
  }

  private native void RandomModeOff_19();
  public void RandomModeOff()
  {
    RandomModeOff_19();
  }

  private native void SetRandomSeed_20(int id0);
  public void SetRandomSeed(int id0)
  {
    SetRandomSeed_20(id0);
  }

  private native int GetRandomSeed_21();
  public int GetRandomSeed()
  {
    return GetRandomSeed_21();
  }

  private native void SetRandomModeType_22(int id0);
  public void SetRandomModeType(int id0)
  {
    SetRandomModeType_22(id0);
  }

  private native int GetRandomModeTypeMinValue_23();
  public int GetRandomModeTypeMinValue()
  {
    return GetRandomModeTypeMinValue_23();
  }

  private native int GetRandomModeTypeMaxValue_24();
  public int GetRandomModeTypeMaxValue()
  {
    return GetRandomModeTypeMaxValue_24();
  }

  private native int GetRandomModeType_25();
  public int GetRandomModeType()
  {
    return GetRandomModeType_25();
  }

  private native void SetProportionalMaximumNumberOfPoints_26(boolean id0);
  public void SetProportionalMaximumNumberOfPoints(boolean id0)
  {
    SetProportionalMaximumNumberOfPoints_26(id0);
  }

  private native boolean GetProportionalMaximumNumberOfPoints_27();
  public boolean GetProportionalMaximumNumberOfPoints()
  {
    return GetProportionalMaximumNumberOfPoints_27();
  }

  private native void ProportionalMaximumNumberOfPointsOn_28();
  public void ProportionalMaximumNumberOfPointsOn()
  {
    ProportionalMaximumNumberOfPointsOn_28();
  }

  private native void ProportionalMaximumNumberOfPointsOff_29();
  public void ProportionalMaximumNumberOfPointsOff()
  {
    ProportionalMaximumNumberOfPointsOff_29();
  }

  private native void SetGenerateVertices_30(boolean id0);
  public void SetGenerateVertices(boolean id0)
  {
    SetGenerateVertices_30(id0);
  }

  private native boolean GetGenerateVertices_31();
  public boolean GetGenerateVertices()
  {
    return GetGenerateVertices_31();
  }

  private native void GenerateVerticesOn_32();
  public void GenerateVerticesOn()
  {
    GenerateVerticesOn_32();
  }

  private native void GenerateVerticesOff_33();
  public void GenerateVerticesOff()
  {
    GenerateVerticesOff_33();
  }

  private native void SetSingleVertexPerCell_34(boolean id0);
  public void SetSingleVertexPerCell(boolean id0)
  {
    SetSingleVertexPerCell_34(id0);
  }

  private native boolean GetSingleVertexPerCell_35();
  public boolean GetSingleVertexPerCell()
  {
    return GetSingleVertexPerCell_35();
  }

  private native void SingleVertexPerCellOn_36();
  public void SingleVertexPerCellOn()
  {
    SingleVertexPerCellOn_36();
  }

  private native void SingleVertexPerCellOff_37();
  public void SingleVertexPerCellOff()
  {
    SingleVertexPerCellOff_37();
  }

  private native void SetOutputPointsPrecision_38(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_38(id0);
  }

  private native int GetOutputPointsPrecision_39();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_39();
  }

  public vtkMaskPoints() { super(); }

  public vtkMaskPoints(long id) { super(id); }
  public native long   VTKInit();

}
