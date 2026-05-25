// java wrapper for vtkImplicitSelectionLoop object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitSelectionLoop extends vtkImplicitFunction
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

  private native double EvaluateFunction_4(double id0[]);
  public double EvaluateFunction(double id0[])
  {
    return EvaluateFunction_4(id0);
  }

  private native void EvaluateGradient_5(double id0[],double id1[]);
  public void EvaluateGradient(double id0[],double id1[])
  {
    EvaluateGradient_5(id0,id1);
  }

  private native void SetLoop_6(vtkPoints id0);
  public void SetLoop(vtkPoints id0)
  {
    SetLoop_6(id0);
  }

  private native long GetLoop_7();
  public vtkPoints GetLoop()
  {
    long temp = GetLoop_7();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAutomaticNormalGeneration_8(int id0);
  public void SetAutomaticNormalGeneration(int id0)
  {
    SetAutomaticNormalGeneration_8(id0);
  }

  private native int GetAutomaticNormalGeneration_9();
  public int GetAutomaticNormalGeneration()
  {
    return GetAutomaticNormalGeneration_9();
  }

  private native void AutomaticNormalGenerationOn_10();
  public void AutomaticNormalGenerationOn()
  {
    AutomaticNormalGenerationOn_10();
  }

  private native void AutomaticNormalGenerationOff_11();
  public void AutomaticNormalGenerationOff()
  {
    AutomaticNormalGenerationOff_11();
  }

  private native void SetNormal_12(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_12(id0,id1,id2);
  }

  private native void SetNormal_13(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_13(id0);
  }

  private native double[] GetNormal_14();
  public double[] GetNormal()
  {
    return GetNormal_14();
  }

  private native long GetMTime_15();
  public long GetMTime()
  {
    return GetMTime_15();
  }

  private native void EvaluateFunction_16(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_16(id0,id1);
  }

  private native double EvaluateFunction_17(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_17(id0,id1,id2);
  }

  public vtkImplicitSelectionLoop() { super(); }

  public vtkImplicitSelectionLoop(long id) { super(id); }
  public native long   VTKInit();

}
