// java wrapper for vtkVolumeContourSpectrumFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVolumeContourSpectrumFilter extends vtkDataObjectAlgorithm
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

  private native void SetArcId_4(long id0);
  public void SetArcId(long id0)
  {
    SetArcId_4(id0);
  }

  private native long GetArcId_5();
  public long GetArcId()
  {
    return GetArcId_5();
  }

  private native void SetNumberOfSamples_6(int id0);
  public void SetNumberOfSamples(int id0)
  {
    SetNumberOfSamples_6(id0);
  }

  private native int GetNumberOfSamples_7();
  public int GetNumberOfSamples()
  {
    return GetNumberOfSamples_7();
  }

  private native void SetFieldId_8(long id0);
  public void SetFieldId(long id0)
  {
    SetFieldId_8(id0);
  }

  private native long GetFieldId_9();
  public long GetFieldId()
  {
    return GetFieldId_9();
  }

  private native long GetOutput_10();
  public vtkTable GetOutput()
  {
    long temp = GetOutput_10();

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkVolumeContourSpectrumFilter() { super(); }

  public vtkVolumeContourSpectrumFilter(long id) { super(id); }
  public native long   VTKInit();

}
