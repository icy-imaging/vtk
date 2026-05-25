// java wrapper for vtkProgrammableGlyphFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProgrammableGlyphFilter extends vtkPolyDataAlgorithm
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

  private native void SetSourceConnection_4(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_4(id0);
  }

  private native void SetSourceData_5(vtkPolyData id0);
  public void SetSourceData(vtkPolyData id0)
  {
    SetSourceData_5(id0);
  }

  private native long GetSource_6();
  public vtkPolyData GetSource()
  {
    long temp = GetSource_6();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGlyphMethod_7( Object id0, byte[] id1, int len1);
  public void SetGlyphMethod( Object id0, String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetGlyphMethod_7(id0, bytes1, bytes1.length);
  }

  private native long GetPointId_8();
  public long GetPointId()
  {
    return GetPointId_8();
  }

  private native double[] GetPoint_9();
  public double[] GetPoint()
  {
    return GetPoint_9();
  }

  private native long GetPointData_10();
  public vtkPointData GetPointData()
  {
    long temp = GetPointData_10();

    if (temp == 0) return null;
    return (vtkPointData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetColorMode_11(int id0);
  public void SetColorMode(int id0)
  {
    SetColorMode_11(id0);
  }

  private native int GetColorMode_12();
  public int GetColorMode()
  {
    return GetColorMode_12();
  }

  private native void SetColorModeToColorByInput_13();
  public void SetColorModeToColorByInput()
  {
    SetColorModeToColorByInput_13();
  }

  private native void SetColorModeToColorBySource_14();
  public void SetColorModeToColorBySource()
  {
    SetColorModeToColorBySource_14();
  }

  private native byte[] GetColorModeAsString_15();
  public String GetColorModeAsString()
  {
    return new String(GetColorModeAsString_15(), StandardCharsets.UTF_8);
  }

  public vtkProgrammableGlyphFilter() { super(); }

  public vtkProgrammableGlyphFilter(long id) { super(id); }
  public native long   VTKInit();

}
