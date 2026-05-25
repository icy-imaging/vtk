// java wrapper for vtkInitialValueProblemSolver object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInitialValueProblemSolver extends vtkObject
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

  private native void SetFunctionSet_4(vtkFunctionSet id0);
  public void SetFunctionSet(vtkFunctionSet id0)
  {
    SetFunctionSet_4(id0);
  }

  private native long GetFunctionSet_5();
  public vtkFunctionSet GetFunctionSet()
  {
    long temp = GetFunctionSet_5();

    if (temp == 0) return null;
    return (vtkFunctionSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int IsAdaptive_6();
  public int IsAdaptive()
  {
    return IsAdaptive_6();
  }

  public vtkInitialValueProblemSolver() { super(); }

  public vtkInitialValueProblemSolver(long id) { super(id); }

}
