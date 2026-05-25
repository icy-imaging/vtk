// java wrapper for vtkDSPFilterDefinition object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDSPFilterDefinition extends vtkObject
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

  private native void Copy_4(vtkDSPFilterDefinition id0);
  public void Copy(vtkDSPFilterDefinition id0)
  {
    Copy_4(id0);
  }

  private native void Clear_5();
  public void Clear()
  {
    Clear_5();
  }

  private native boolean IsThisInputVariableInstanceNeeded_6(int id0,int id1);
  public boolean IsThisInputVariableInstanceNeeded(int id0,int id1)
  {
    return IsThisInputVariableInstanceNeeded_6(id0,id1);
  }

  private native void PushBackNumeratorWeight_7(double id0);
  public void PushBackNumeratorWeight(double id0)
  {
    PushBackNumeratorWeight_7(id0);
  }

  private native void PushBackDenominatorWeight_8(double id0);
  public void PushBackDenominatorWeight(double id0)
  {
    PushBackDenominatorWeight_8(id0);
  }

  private native void PushBackForwardNumeratorWeight_9(double id0);
  public void PushBackForwardNumeratorWeight(double id0)
  {
    PushBackForwardNumeratorWeight_9(id0);
  }

  private native void SetInputVariableName_10(byte[] id0, int len0);
  public void SetInputVariableName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInputVariableName_10(bytes0, bytes0.length);
  }

  private native void SetOutputVariableName_11(byte[] id0, int len0);
  public void SetOutputVariableName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOutputVariableName_11(bytes0, bytes0.length);
  }

  private native byte[] GetInputVariableName_12();
  public String GetInputVariableName()
  {
    return new String(GetInputVariableName_12(), StandardCharsets.UTF_8);
  }

  private native byte[] GetOutputVariableName_13();
  public String GetOutputVariableName()
  {
    return new String(GetOutputVariableName_13(), StandardCharsets.UTF_8);
  }

  private native int GetNumNumeratorWeights_14();
  public int GetNumNumeratorWeights()
  {
    return GetNumNumeratorWeights_14();
  }

  private native int GetNumDenominatorWeights_15();
  public int GetNumDenominatorWeights()
  {
    return GetNumDenominatorWeights_15();
  }

  private native int GetNumForwardNumeratorWeights_16();
  public int GetNumForwardNumeratorWeights()
  {
    return GetNumForwardNumeratorWeights_16();
  }

  private native double GetNumeratorWeight_17(int id0);
  public double GetNumeratorWeight(int id0)
  {
    return GetNumeratorWeight_17(id0);
  }

  private native double GetDenominatorWeight_18(int id0);
  public double GetDenominatorWeight(int id0)
  {
    return GetDenominatorWeight_18(id0);
  }

  private native double GetForwardNumeratorWeight_19(int id0);
  public double GetForwardNumeratorWeight(int id0)
  {
    return GetForwardNumeratorWeight_19(id0);
  }

  public vtkDSPFilterDefinition() { super(); }

  public vtkDSPFilterDefinition(long id) { super(id); }
  public native long   VTKInit();

}
