// java wrapper for vtkForEach object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkForEach extends vtkDataObjectAlgorithm
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

  private native long FOR_EACH_FILTER_4();
  public vtkInformationObjectBaseKey FOR_EACH_FILTER()
  {
    long temp = FOR_EACH_FILTER_4();

    if (temp == 0) return null;
    return (vtkInformationObjectBaseKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRange_5(vtkExecutionRange id0);
  public void SetRange(vtkExecutionRange id0)
  {
    SetRange_5(id0);
  }

  private native boolean IsIterating_6();
  public boolean IsIterating()
  {
    return IsIterating_6();
  }

  private native void RegisterEndFor_7(vtkEndFor id0);
  public void RegisterEndFor(vtkEndFor id0)
  {
    RegisterEndFor_7(id0);
  }

  public vtkForEach() { super(); }

  public vtkForEach(long id) { super(id); }
  public native long   VTKInit();

}
