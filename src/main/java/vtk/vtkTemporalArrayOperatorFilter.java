// java wrapper for vtkTemporalArrayOperatorFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTemporalArrayOperatorFilter extends vtkMultiTimeStepAlgorithm
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

  private native void SetOperator_4(int id0);
  public void SetOperator(int id0)
  {
    SetOperator_4(id0);
  }

  private native int GetOperator_5();
  public int GetOperator()
  {
    return GetOperator_5();
  }

  private native void SetFirstTimeStepIndex_6(int id0);
  public void SetFirstTimeStepIndex(int id0)
  {
    SetFirstTimeStepIndex_6(id0);
  }

  private native int GetFirstTimeStepIndex_7();
  public int GetFirstTimeStepIndex()
  {
    return GetFirstTimeStepIndex_7();
  }

  private native void SetSecondTimeStepIndex_8(int id0);
  public void SetSecondTimeStepIndex(int id0)
  {
    SetSecondTimeStepIndex_8(id0);
  }

  private native int GetSecondTimeStepIndex_9();
  public int GetSecondTimeStepIndex()
  {
    return GetSecondTimeStepIndex_9();
  }

  private native void SetOutputArrayNameSuffix_10(byte[] id0, int len0);
  public void SetOutputArrayNameSuffix(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOutputArrayNameSuffix_10(bytes0, bytes0.length);
  }

  private native byte[] GetOutputArrayNameSuffix_11();
  public String GetOutputArrayNameSuffix()
  {
    return new String(GetOutputArrayNameSuffix_11(), StandardCharsets.UTF_8);
  }

  public vtkTemporalArrayOperatorFilter() { super(); }

  public vtkTemporalArrayOperatorFilter(long id) { super(id); }
  public native long   VTKInit();

}
