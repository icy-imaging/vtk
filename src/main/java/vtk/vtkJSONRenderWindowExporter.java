// java wrapper for vtkJSONRenderWindowExporter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkJSONRenderWindowExporter extends vtkExporter
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

  private native void SetSerializer_4(vtkVtkJSSceneGraphSerializer id0);
  public void SetSerializer(vtkVtkJSSceneGraphSerializer id0)
  {
    SetSerializer_4(id0);
  }

  private native long GetSerializer_5();
  public vtkVtkJSSceneGraphSerializer GetSerializer()
  {
    long temp = GetSerializer_5();

    if (temp == 0) return null;
    return (vtkVtkJSSceneGraphSerializer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetArchiver_6(vtkArchiver id0);
  public void SetArchiver(vtkArchiver id0)
  {
    SetArchiver_6(id0);
  }

  private native long GetArchiver_7();
  public vtkArchiver GetArchiver()
  {
    long temp = GetArchiver_7();

    if (temp == 0) return null;
    return (vtkArchiver)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void WriteData_8();
  public void WriteData()
  {
    WriteData_8();
  }

  private native void SetCompactOutput_9(boolean id0);
  public void SetCompactOutput(boolean id0)
  {
    SetCompactOutput_9(id0);
  }

  private native boolean GetCompactOutput_10();
  public boolean GetCompactOutput()
  {
    return GetCompactOutput_10();
  }

  private native void CompactOutputOn_11();
  public void CompactOutputOn()
  {
    CompactOutputOn_11();
  }

  private native void CompactOutputOff_12();
  public void CompactOutputOff()
  {
    CompactOutputOff_12();
  }

  public vtkJSONRenderWindowExporter() { super(); }

  public vtkJSONRenderWindowExporter(long id) { super(id); }
  public native long   VTKInit();

}
