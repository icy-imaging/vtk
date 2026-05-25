// java wrapper for vtkPlotFunctionalBag object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlotFunctionalBag extends vtkPlot
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

  private native boolean IsBag_4();
  public boolean IsBag()
  {
    return IsBag_4();
  }

  private native boolean GetVisible_5();
  public boolean GetVisible()
  {
    return GetVisible_5();
  }

  private native boolean Paint_6(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_6(id0);
  }

  private native void GetBounds_7(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_7(id0);
  }

  private native void GetUnscaledInputBounds_8(double id0[]);
  public void GetUnscaledInputBounds(double id0[])
  {
    GetUnscaledInputBounds_8(id0);
  }

  private native void SetLookupTable_9(vtkScalarsToColors id0);
  public void SetLookupTable(vtkScalarsToColors id0)
  {
    SetLookupTable_9(id0);
  }

  private native long GetLookupTable_10();
  public vtkScalarsToColors GetLookupTable()
  {
    long temp = GetLookupTable_10();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLookupTable_11();
  public void CreateDefaultLookupTable()
  {
    CreateDefaultLookupTable_11();
  }

  private native boolean UpdateCache_12();
  public boolean UpdateCache()
  {
    return UpdateCache_12();
  }

  public vtkPlotFunctionalBag() { super(); }

  public vtkPlotFunctionalBag(long id) { super(id); }
  public native long   VTKInit();

}
