// java wrapper for vtkImageDataStreamer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageDataStreamer extends vtkImageAlgorithm
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

  private native void SetNumberOfStreamDivisions_4(int id0);
  public void SetNumberOfStreamDivisions(int id0)
  {
    SetNumberOfStreamDivisions_4(id0);
  }

  private native int GetNumberOfStreamDivisions_5();
  public int GetNumberOfStreamDivisions()
  {
    return GetNumberOfStreamDivisions_5();
  }

  private native void SetExtentTranslator_6(vtkExtentTranslator id0);
  public void SetExtentTranslator(vtkExtentTranslator id0)
  {
    SetExtentTranslator_6(id0);
  }

  private native long GetExtentTranslator_7();
  public vtkExtentTranslator GetExtentTranslator()
  {
    long temp = GetExtentTranslator_7();

    if (temp == 0) return null;
    return (vtkExtentTranslator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkImageDataStreamer() { super(); }

  public vtkImageDataStreamer(long id) { super(id); }
  public native long   VTKInit();

}
