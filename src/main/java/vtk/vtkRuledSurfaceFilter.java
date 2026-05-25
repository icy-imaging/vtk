// java wrapper for vtkRuledSurfaceFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRuledSurfaceFilter extends vtkPolyDataAlgorithm
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

  private native void SetDistanceFactor_4(double id0);
  public void SetDistanceFactor(double id0)
  {
    SetDistanceFactor_4(id0);
  }

  private native double GetDistanceFactorMinValue_5();
  public double GetDistanceFactorMinValue()
  {
    return GetDistanceFactorMinValue_5();
  }

  private native double GetDistanceFactorMaxValue_6();
  public double GetDistanceFactorMaxValue()
  {
    return GetDistanceFactorMaxValue_6();
  }

  private native double GetDistanceFactor_7();
  public double GetDistanceFactor()
  {
    return GetDistanceFactor_7();
  }

  private native void SetOnRatio_8(int id0);
  public void SetOnRatio(int id0)
  {
    SetOnRatio_8(id0);
  }

  private native int GetOnRatioMinValue_9();
  public int GetOnRatioMinValue()
  {
    return GetOnRatioMinValue_9();
  }

  private native int GetOnRatioMaxValue_10();
  public int GetOnRatioMaxValue()
  {
    return GetOnRatioMaxValue_10();
  }

  private native int GetOnRatio_11();
  public int GetOnRatio()
  {
    return GetOnRatio_11();
  }

  private native void SetOffset_12(int id0);
  public void SetOffset(int id0)
  {
    SetOffset_12(id0);
  }

  private native int GetOffsetMinValue_13();
  public int GetOffsetMinValue()
  {
    return GetOffsetMinValue_13();
  }

  private native int GetOffsetMaxValue_14();
  public int GetOffsetMaxValue()
  {
    return GetOffsetMaxValue_14();
  }

  private native int GetOffset_15();
  public int GetOffset()
  {
    return GetOffset_15();
  }

  private native void SetCloseSurface_16(int id0);
  public void SetCloseSurface(int id0)
  {
    SetCloseSurface_16(id0);
  }

  private native int GetCloseSurface_17();
  public int GetCloseSurface()
  {
    return GetCloseSurface_17();
  }

  private native void CloseSurfaceOn_18();
  public void CloseSurfaceOn()
  {
    CloseSurfaceOn_18();
  }

  private native void CloseSurfaceOff_19();
  public void CloseSurfaceOff()
  {
    CloseSurfaceOff_19();
  }

  private native void SetRuledMode_20(int id0);
  public void SetRuledMode(int id0)
  {
    SetRuledMode_20(id0);
  }

  private native int GetRuledModeMinValue_21();
  public int GetRuledModeMinValue()
  {
    return GetRuledModeMinValue_21();
  }

  private native int GetRuledModeMaxValue_22();
  public int GetRuledModeMaxValue()
  {
    return GetRuledModeMaxValue_22();
  }

  private native int GetRuledMode_23();
  public int GetRuledMode()
  {
    return GetRuledMode_23();
  }

  private native void SetRuledModeToResample_24();
  public void SetRuledModeToResample()
  {
    SetRuledModeToResample_24();
  }

  private native void SetRuledModeToPointWalk_25();
  public void SetRuledModeToPointWalk()
  {
    SetRuledModeToPointWalk_25();
  }

  private native byte[] GetRuledModeAsString_26();
  public String GetRuledModeAsString()
  {
    return new String(GetRuledModeAsString_26(), StandardCharsets.UTF_8);
  }

  private native void SetResolution_27(int id0,int id1);
  public void SetResolution(int id0,int id1)
  {
    SetResolution_27(id0,id1);
  }

  private native void SetResolution_28(int id0[]);
  public void SetResolution(int id0[])
  {
    SetResolution_28(id0);
  }

  private native int[] GetResolution_29();
  public int[] GetResolution()
  {
    return GetResolution_29();
  }

  private native void SetPassLines_30(int id0);
  public void SetPassLines(int id0)
  {
    SetPassLines_30(id0);
  }

  private native int GetPassLines_31();
  public int GetPassLines()
  {
    return GetPassLines_31();
  }

  private native void PassLinesOn_32();
  public void PassLinesOn()
  {
    PassLinesOn_32();
  }

  private native void PassLinesOff_33();
  public void PassLinesOff()
  {
    PassLinesOff_33();
  }

  private native void SetOrientLoops_34(int id0);
  public void SetOrientLoops(int id0)
  {
    SetOrientLoops_34(id0);
  }

  private native int GetOrientLoops_35();
  public int GetOrientLoops()
  {
    return GetOrientLoops_35();
  }

  private native void OrientLoopsOn_36();
  public void OrientLoopsOn()
  {
    OrientLoopsOn_36();
  }

  private native void OrientLoopsOff_37();
  public void OrientLoopsOff()
  {
    OrientLoopsOff_37();
  }

  public vtkRuledSurfaceFilter() { super(); }

  public vtkRuledSurfaceFilter(long id) { super(id); }
  public native long   VTKInit();

}
