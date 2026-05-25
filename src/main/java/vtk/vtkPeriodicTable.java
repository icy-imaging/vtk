// java wrapper for vtkPeriodicTable object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPeriodicTable extends vtkObject
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

  private native long GetBlueObeliskData_4();
  public vtkBlueObeliskData GetBlueObeliskData()
  {
    long temp = GetBlueObeliskData_4();

    if (temp == 0) return null;
    return (vtkBlueObeliskData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native short GetNumberOfElements_5();
  public short GetNumberOfElements()
  {
    return GetNumberOfElements_5();
  }

  private native byte[] GetSymbol_6(short id0);
  public String GetSymbol(short id0)
  {
    return new String(GetSymbol_6(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetElementName_7(short id0);
  public String GetElementName(short id0)
  {
    return new String(GetElementName_7(id0), StandardCharsets.UTF_8);
  }

  private native short GetAtomicNumber_8(byte[] id0, int len0);
  public short GetAtomicNumber(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetAtomicNumber_8(bytes0, bytes0.length);
  }

  private native float GetCovalentRadius_9(short id0);
  public float GetCovalentRadius(short id0)
  {
    return GetCovalentRadius_9(id0);
  }

  private native float GetVDWRadius_10(short id0);
  public float GetVDWRadius(short id0)
  {
    return GetVDWRadius_10(id0);
  }

  private native float GetMaxVDWRadius_11();
  public float GetMaxVDWRadius()
  {
    return GetMaxVDWRadius_11();
  }

  private native void GetDefaultLUT_12(vtkLookupTable id0);
  public void GetDefaultLUT(vtkLookupTable id0)
  {
    GetDefaultLUT_12(id0);
  }

  private native void GetDefaultRGBTuple_13(short id0,float id1[]);
  public void GetDefaultRGBTuple(short id0,float id1[])
  {
    GetDefaultRGBTuple_13(id0,id1);
  }

  public vtkPeriodicTable() { super(); }

  public vtkPeriodicTable(long id) { super(id); }
  public native long   VTKInit();

}
