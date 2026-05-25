// java wrapper for vtkInterpolateDataSetAttributes object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInterpolateDataSetAttributes extends vtkDataSetAlgorithm
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

  private native long GetInputList_4();
  public vtkDataSetCollection GetInputList()
  {
    long temp = GetInputList_4();

    if (temp == 0) return null;
    return (vtkDataSetCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetT_5(double id0);
  public void SetT(double id0)
  {
    SetT_5(id0);
  }

  private native double GetTMinValue_6();
  public double GetTMinValue()
  {
    return GetTMinValue_6();
  }

  private native double GetTMaxValue_7();
  public double GetTMaxValue()
  {
    return GetTMaxValue_7();
  }

  private native double GetT_8();
  public double GetT()
  {
    return GetT_8();
  }

  public vtkInterpolateDataSetAttributes() { super(); }

  public vtkInterpolateDataSetAttributes(long id) { super(id); }
  public native long   VTKInit();

}
