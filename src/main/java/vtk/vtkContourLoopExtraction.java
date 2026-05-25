// java wrapper for vtkContourLoopExtraction object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContourLoopExtraction extends vtkPolyDataAlgorithm
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

  private native void SetLoopClosure_4(int id0);
  public void SetLoopClosure(int id0)
  {
    SetLoopClosure_4(id0);
  }

  private native int GetLoopClosureMinValue_5();
  public int GetLoopClosureMinValue()
  {
    return GetLoopClosureMinValue_5();
  }

  private native int GetLoopClosureMaxValue_6();
  public int GetLoopClosureMaxValue()
  {
    return GetLoopClosureMaxValue_6();
  }

  private native int GetLoopClosure_7();
  public int GetLoopClosure()
  {
    return GetLoopClosure_7();
  }

  private native void SetLoopClosureToOff_8();
  public void SetLoopClosureToOff()
  {
    SetLoopClosureToOff_8();
  }

  private native void SetLoopClosureToBoundary_9();
  public void SetLoopClosureToBoundary()
  {
    SetLoopClosureToBoundary_9();
  }

  private native void SetLoopClosureToAll_10();
  public void SetLoopClosureToAll()
  {
    SetLoopClosureToAll_10();
  }

  private native byte[] GetLoopClosureAsString_11();
  public String GetLoopClosureAsString()
  {
    return new String(GetLoopClosureAsString_11(), StandardCharsets.UTF_8);
  }

  private native void SetScalarThresholding_12(boolean id0);
  public void SetScalarThresholding(boolean id0)
  {
    SetScalarThresholding_12(id0);
  }

  private native boolean GetScalarThresholding_13();
  public boolean GetScalarThresholding()
  {
    return GetScalarThresholding_13();
  }

  private native void ScalarThresholdingOn_14();
  public void ScalarThresholdingOn()
  {
    ScalarThresholdingOn_14();
  }

  private native void ScalarThresholdingOff_15();
  public void ScalarThresholdingOff()
  {
    ScalarThresholdingOff_15();
  }

  private native void SetScalarRange_16(double id0,double id1);
  public void SetScalarRange(double id0,double id1)
  {
    SetScalarRange_16(id0,id1);
  }

  private native void SetScalarRange_17(double id0[]);
  public void SetScalarRange(double id0[])
  {
    SetScalarRange_17(id0);
  }

  private native double[] GetScalarRange_18();
  public double[] GetScalarRange()
  {
    return GetScalarRange_18();
  }

  private native void SetNormal_19(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_19(id0,id1,id2);
  }

  private native void SetNormal_20(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_20(id0);
  }

  private native double[] GetNormal_21();
  public double[] GetNormal()
  {
    return GetNormal_21();
  }

  private native void SetOutputMode_22(int id0);
  public void SetOutputMode(int id0)
  {
    SetOutputMode_22(id0);
  }

  private native int GetOutputModeMinValue_23();
  public int GetOutputModeMinValue()
  {
    return GetOutputModeMinValue_23();
  }

  private native int GetOutputModeMaxValue_24();
  public int GetOutputModeMaxValue()
  {
    return GetOutputModeMaxValue_24();
  }

  private native int GetOutputMode_25();
  public int GetOutputMode()
  {
    return GetOutputMode_25();
  }

  private native void SetOutputModeToPolygons_26();
  public void SetOutputModeToPolygons()
  {
    SetOutputModeToPolygons_26();
  }

  private native void SetOutputModeToPolylines_27();
  public void SetOutputModeToPolylines()
  {
    SetOutputModeToPolylines_27();
  }

  private native void SetOutputModeToBoth_28();
  public void SetOutputModeToBoth()
  {
    SetOutputModeToBoth_28();
  }

  private native byte[] GetOutputModeAsString_29();
  public String GetOutputModeAsString()
  {
    return new String(GetOutputModeAsString_29(), StandardCharsets.UTF_8);
  }

  private native void SetCleanPoints_30(boolean id0);
  public void SetCleanPoints(boolean id0)
  {
    SetCleanPoints_30(id0);
  }

  private native boolean GetCleanPoints_31();
  public boolean GetCleanPoints()
  {
    return GetCleanPoints_31();
  }

  private native void CleanPointsOn_32();
  public void CleanPointsOn()
  {
    CleanPointsOn_32();
  }

  private native void CleanPointsOff_33();
  public void CleanPointsOff()
  {
    CleanPointsOff_33();
  }

  public vtkContourLoopExtraction() { super(); }

  public vtkContourLoopExtraction(long id) { super(id); }
  public native long   VTKInit();

}
