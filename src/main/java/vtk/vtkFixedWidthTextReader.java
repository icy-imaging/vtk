// java wrapper for vtkFixedWidthTextReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFixedWidthTextReader extends vtkTableAlgorithm
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

  private native byte[] GetFileName_4();
  public String GetFileName()
  {
    return new String(GetFileName_4(), StandardCharsets.UTF_8);
  }

  private native void SetFileName_5(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_5(bytes0, bytes0.length);
  }

  private native void SetFieldWidth_6(int id0);
  public void SetFieldWidth(int id0)
  {
    SetFieldWidth_6(id0);
  }

  private native int GetFieldWidth_7();
  public int GetFieldWidth()
  {
    return GetFieldWidth_7();
  }

  private native void SetStripWhiteSpace_8(boolean id0);
  public void SetStripWhiteSpace(boolean id0)
  {
    SetStripWhiteSpace_8(id0);
  }

  private native boolean GetStripWhiteSpace_9();
  public boolean GetStripWhiteSpace()
  {
    return GetStripWhiteSpace_9();
  }

  private native void StripWhiteSpaceOn_10();
  public void StripWhiteSpaceOn()
  {
    StripWhiteSpaceOn_10();
  }

  private native void StripWhiteSpaceOff_11();
  public void StripWhiteSpaceOff()
  {
    StripWhiteSpaceOff_11();
  }

  private native boolean GetHaveHeaders_12();
  public boolean GetHaveHeaders()
  {
    return GetHaveHeaders_12();
  }

  private native void SetHaveHeaders_13(boolean id0);
  public void SetHaveHeaders(boolean id0)
  {
    SetHaveHeaders_13(id0);
  }

  private native void HaveHeadersOn_14();
  public void HaveHeadersOn()
  {
    HaveHeadersOn_14();
  }

  private native void HaveHeadersOff_15();
  public void HaveHeadersOff()
  {
    HaveHeadersOff_15();
  }

  private native void SetTableErrorObserver_16(vtkCommand id0);
  public void SetTableErrorObserver(vtkCommand id0)
  {
    SetTableErrorObserver_16(id0);
  }

  private native long GetTableErrorObserver_17();
  public vtkCommand GetTableErrorObserver()
  {
    long temp = GetTableErrorObserver_17();

    if (temp == 0) return null;
    return (vtkCommand)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkFixedWidthTextReader() { super(); }

  public vtkFixedWidthTextReader(long id) { super(id); }
  public native long   VTKInit();

}
