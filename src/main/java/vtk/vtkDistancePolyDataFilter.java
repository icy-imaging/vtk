// java wrapper for vtkDistancePolyDataFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDistancePolyDataFilter extends vtkPolyDataAlgorithm
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

  private native void SetSignedDistance_4(int id0);
  public void SetSignedDistance(int id0)
  {
    SetSignedDistance_4(id0);
  }

  private native int GetSignedDistance_5();
  public int GetSignedDistance()
  {
    return GetSignedDistance_5();
  }

  private native void SignedDistanceOn_6();
  public void SignedDistanceOn()
  {
    SignedDistanceOn_6();
  }

  private native void SignedDistanceOff_7();
  public void SignedDistanceOff()
  {
    SignedDistanceOff_7();
  }

  private native void SetNegateDistance_8(int id0);
  public void SetNegateDistance(int id0)
  {
    SetNegateDistance_8(id0);
  }

  private native int GetNegateDistance_9();
  public int GetNegateDistance()
  {
    return GetNegateDistance_9();
  }

  private native void NegateDistanceOn_10();
  public void NegateDistanceOn()
  {
    NegateDistanceOn_10();
  }

  private native void NegateDistanceOff_11();
  public void NegateDistanceOff()
  {
    NegateDistanceOff_11();
  }

  private native void SetComputeSecondDistance_12(int id0);
  public void SetComputeSecondDistance(int id0)
  {
    SetComputeSecondDistance_12(id0);
  }

  private native int GetComputeSecondDistance_13();
  public int GetComputeSecondDistance()
  {
    return GetComputeSecondDistance_13();
  }

  private native void ComputeSecondDistanceOn_14();
  public void ComputeSecondDistanceOn()
  {
    ComputeSecondDistanceOn_14();
  }

  private native void ComputeSecondDistanceOff_15();
  public void ComputeSecondDistanceOff()
  {
    ComputeSecondDistanceOff_15();
  }

  private native long GetSecondDistanceOutput_16();
  public vtkPolyData GetSecondDistanceOutput()
  {
    long temp = GetSecondDistanceOutput_16();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetComputeCellCenterDistance_17(int id0);
  public void SetComputeCellCenterDistance(int id0)
  {
    SetComputeCellCenterDistance_17(id0);
  }

  private native int GetComputeCellCenterDistance_18();
  public int GetComputeCellCenterDistance()
  {
    return GetComputeCellCenterDistance_18();
  }

  private native void ComputeCellCenterDistanceOn_19();
  public void ComputeCellCenterDistanceOn()
  {
    ComputeCellCenterDistanceOn_19();
  }

  private native void ComputeCellCenterDistanceOff_20();
  public void ComputeCellCenterDistanceOff()
  {
    ComputeCellCenterDistanceOff_20();
  }

  private native void SetComputeDirection_21(int id0);
  public void SetComputeDirection(int id0)
  {
    SetComputeDirection_21(id0);
  }

  private native int GetComputeDirection_22();
  public int GetComputeDirection()
  {
    return GetComputeDirection_22();
  }

  private native void ComputeDirectionOn_23();
  public void ComputeDirectionOn()
  {
    ComputeDirectionOn_23();
  }

  private native void ComputeDirectionOff_24();
  public void ComputeDirectionOff()
  {
    ComputeDirectionOff_24();
  }

  public vtkDistancePolyDataFilter() { super(); }

  public vtkDistancePolyDataFilter(long id) { super(id); }
  public native long   VTKInit();

}
