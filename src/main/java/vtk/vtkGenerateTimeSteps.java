// java wrapper for vtkGenerateTimeSteps object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenerateTimeSteps extends vtkPassInputTypeAlgorithm
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

  private native int GetNumberOfTimeSteps_4();
  public int GetNumberOfTimeSteps()
  {
    return GetNumberOfTimeSteps_4();
  }

  private native void AddTimeStepValue_5(double id0);
  public void AddTimeStepValue(double id0)
  {
    AddTimeStepValue_5(id0);
  }

  private native void GenerateTimeStepValues_6(double id0,double id1,double id2);
  public void GenerateTimeStepValues(double id0,double id1,double id2)
  {
    GenerateTimeStepValues_6(id0,id1,id2);
  }

  private native void ClearTimeStepValues_7();
  public void ClearTimeStepValues()
  {
    ClearTimeStepValues_7();
  }

  public vtkGenerateTimeSteps() { super(); }

  public vtkGenerateTimeSteps(long id) { super(id); }
  public native long   VTKInit();

}
