// java wrapper for vtkUnstructuredGridQuadricDecimation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUnstructuredGridQuadricDecimation extends vtkUnstructuredGridAlgorithm
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

  private native void SetTargetReduction_4(double id0);
  public void SetTargetReduction(double id0)
  {
    SetTargetReduction_4(id0);
  }

  private native double GetTargetReduction_5();
  public double GetTargetReduction()
  {
    return GetTargetReduction_5();
  }

  private native void SetNumberOfTetsOutput_6(int id0);
  public void SetNumberOfTetsOutput(int id0)
  {
    SetNumberOfTetsOutput_6(id0);
  }

  private native int GetNumberOfTetsOutput_7();
  public int GetNumberOfTetsOutput()
  {
    return GetNumberOfTetsOutput_7();
  }

  private native void SetNumberOfEdgesToDecimate_8(int id0);
  public void SetNumberOfEdgesToDecimate(int id0)
  {
    SetNumberOfEdgesToDecimate_8(id0);
  }

  private native int GetNumberOfEdgesToDecimate_9();
  public int GetNumberOfEdgesToDecimate()
  {
    return GetNumberOfEdgesToDecimate_9();
  }

  private native void SetNumberOfCandidates_10(int id0);
  public void SetNumberOfCandidates(int id0)
  {
    SetNumberOfCandidates_10(id0);
  }

  private native int GetNumberOfCandidates_11();
  public int GetNumberOfCandidates()
  {
    return GetNumberOfCandidates_11();
  }

  private native void SetAutoAddCandidates_12(int id0);
  public void SetAutoAddCandidates(int id0)
  {
    SetAutoAddCandidates_12(id0);
  }

  private native int GetAutoAddCandidates_13();
  public int GetAutoAddCandidates()
  {
    return GetAutoAddCandidates_13();
  }

  private native void SetAutoAddCandidatesThreshold_14(double id0);
  public void SetAutoAddCandidatesThreshold(double id0)
  {
    SetAutoAddCandidatesThreshold_14(id0);
  }

  private native double GetAutoAddCandidatesThreshold_15();
  public double GetAutoAddCandidatesThreshold()
  {
    return GetAutoAddCandidatesThreshold_15();
  }

  private native void SetBoundaryWeight_16(double id0);
  public void SetBoundaryWeight(double id0)
  {
    SetBoundaryWeight_16(id0);
  }

  private native double GetBoundaryWeight_17();
  public double GetBoundaryWeight()
  {
    return GetBoundaryWeight_17();
  }

  private native void SetScalarsName_18(byte[] id0, int len0);
  public void SetScalarsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScalarsName_18(bytes0, bytes0.length);
  }

  private native byte[] GetScalarsName_19();
  public String GetScalarsName()
  {
    return new String(GetScalarsName_19(), StandardCharsets.UTF_8);
  }

  public vtkUnstructuredGridQuadricDecimation() { super(); }

  public vtkUnstructuredGridQuadricDecimation(long id) { super(id); }
  public native long   VTKInit();

}
