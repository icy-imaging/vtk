// java wrapper for vtkImageProbeFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageProbeFilter extends vtkDataSetAlgorithm
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

  private native void SetSourceData_4(vtkDataObject id0);
  public void SetSourceData(vtkDataObject id0)
  {
    SetSourceData_4(id0);
  }

  private native long GetSource_5();
  public vtkDataObject GetSource()
  {
    long temp = GetSource_5();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSourceConnection_6(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_6(id0);
  }

  private native void SetInterpolator_7(vtkAbstractImageInterpolator id0);
  public void SetInterpolator(vtkAbstractImageInterpolator id0)
  {
    SetInterpolator_7(id0);
  }

  private native long GetInterpolator_8();
  public vtkAbstractImageInterpolator GetInterpolator()
  {
    long temp = GetInterpolator_8();

    if (temp == 0) return null;
    return (vtkAbstractImageInterpolator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkImageProbeFilter() { super(); }

  public vtkImageProbeFilter(long id) { super(id); }
  public native long   VTKInit();

}
