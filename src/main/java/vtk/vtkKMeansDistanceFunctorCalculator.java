// java wrapper for vtkKMeansDistanceFunctorCalculator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkKMeansDistanceFunctorCalculator extends vtkKMeansDistanceFunctor
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

  private native void SetDistanceExpression_4(byte[] id0, int len0);
  public void SetDistanceExpression(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDistanceExpression_4(bytes0, bytes0.length);
  }

  private native byte[] GetDistanceExpression_5();
  public String GetDistanceExpression()
  {
    return new String(GetDistanceExpression_5(), StandardCharsets.UTF_8);
  }

  private native void SetFunctionParser_6(vtkFunctionParser id0);
  public void SetFunctionParser(vtkFunctionParser id0)
  {
    SetFunctionParser_6(id0);
  }

  private native long GetFunctionParser_7();
  public vtkFunctionParser GetFunctionParser()
  {
    long temp = GetFunctionParser_7();

    if (temp == 0) return null;
    return (vtkFunctionParser)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkKMeansDistanceFunctorCalculator() { super(); }

  public vtkKMeansDistanceFunctorCalculator(long id) { super(id); }
  public native long   VTKInit();

}
